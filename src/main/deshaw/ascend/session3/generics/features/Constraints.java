/*
 * Copyright (c) 2021 D. E. Shaw & Co., L.P. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of D. E. Shaw & Co., L.P. ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with D. E. Shaw & Co., L.P.
 */

package deshaw.ascend.session3.generics.features;

import java.io.Externalizable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that explains constraints/bounded generic pattern when using generics in Java
 */
public class Constraints {

    /**
     * Function to copy values from one list (generic) to another list, and excludes a particular value
     * @param from      From list
     * @param to        To list
     * @param toExclude Value/Element to exclude
     * @param <T>       Type parameter
     */
    public static <T extends Comparable<T>> void copyWithValueExcluded(List<T> from, List<T> to, T toExclude) {
        for (T element: from) {
            if (element.compareTo(toExclude) != 0) {
                to.add(element);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(List.of(5, 6));

        copyWithValueExcluded(list1, list2, 4);
        CommonUtils.printLists(list1, list2);
    }
}
