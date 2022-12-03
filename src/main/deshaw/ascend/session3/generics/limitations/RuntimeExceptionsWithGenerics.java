/*
 * Copyright (c) 2021 D. E. Shaw & Co., L.P. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of D. E. Shaw & Co., L.P. ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with D. E. Shaw & Co., L.P.
 */

package deshaw.ascend.session3.generics.limitations;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to explain scope of run time errors even when using generics
 */
public class RuntimeExceptionsWithGenerics {

    public static void introduceRuntimeException(List list) {
        list.add("3");
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        introduceRuntimeException(list);

        System.out.println(list);
    }
}
