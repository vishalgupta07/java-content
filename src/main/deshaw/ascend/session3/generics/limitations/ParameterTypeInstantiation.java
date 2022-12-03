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

import deshaw.ascend.common.model.person.student.Student;

/**
 * Class to explain limitation of generics when instantiating parameter type
 */
public class ParameterTypeInstantiation {

    public static <T> void instantiate(T instance) {
        System.out.println("Instance function called..");
        // Compile time error when you try to define new T()
//        System.out.println(new T());
    }

    public static void main(String[] args) {
        // Can not instantiate a type parameter
        instantiate(new Student());
    }
}
