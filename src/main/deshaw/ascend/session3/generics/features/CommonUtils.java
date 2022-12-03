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

import java.util.List;

public class CommonUtils {

    public static <T> void printLists(List<T> list1, List<T> list2) {
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
    }
}
