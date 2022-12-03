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

import java.util.ArrayList;
import java.util.List;

/**
 * Class to explain difference between raw types and generics
 */
public class RawTypeAndGenericsComparison {

    public static void rawTypeListExample() {
        // Raw type list (Any new developer seeing this code would cringe!)
        List rawTypeList = new ArrayList();
        rawTypeList.add(1);
        rawTypeList.add(2);
        rawTypeList.add(3);
        // Runtime error thrown
        rawTypeList.add("4");

        int total = 0;

        // Object: Code smell
        for (Object element: rawTypeList) {
            // Casting
            total += (int) element;
        }

        assert total == 6;
    }

    public static void genericListExample() {
        List<Integer> genericIntList = new ArrayList<>();
        genericIntList.add(1);
        genericIntList.add(2);
        genericIntList.add(3);
        // Compile type error detected
//        genericIntList.add("4");

        int total = 0;

        // Code smell is removed
        for (int element: genericIntList) {
            // No casting
            total += element;
        }

        assert total == 6;
    }

    public static void main(String[] args) {
        rawTypeListExample();
    }
}
