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

/**
 * Bounded custom generic class example
 */
public class BoundedCustomGenericClass<T extends Comparable<T>> { // class BoundedCustomGenericClass<Comparable<Object>>

    public static void foo() {
        System.out.println("foo");
    }
}
