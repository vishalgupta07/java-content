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
 * Class contains examples for re-usability pattern of generics in Java
 */
public class ReusableMethods {

    /**
     * Function to copy values from one list to another
     * @param from  From list
     * @param to    To list
     * @param <T>   Type parameter
     */
    public static <T> void copy(List<T> from, List<T> to) {
        for (T element: from) {
            to.add(element);
        }
        // The above can also be achieved from collection framework in java: to.addAll(from);
    }

    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> integerList2 = new ArrayList<>(List.of(4, 5, 6));
        copy(integerList1, integerList2);
        CommonUtils.printLists(integerList1, integerList2);

        List<String> stringList1 = new ArrayList<>(List.of("A", "B", "C"));
        List<String> stringList2 = new ArrayList<>(List.of("D", "E", "F"));
        copy(stringList1, stringList2);
        CommonUtils.printLists(stringList1, stringList2);
    }
}
