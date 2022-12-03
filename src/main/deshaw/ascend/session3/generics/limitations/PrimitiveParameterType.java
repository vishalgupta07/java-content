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
 * Class to explain limitation of generics when using primitive in parameter type
 */
public class PrimitiveParameterType {

    public static void main(String[] args) {
        // Can not use primitive type in generic
//        CustomGenericClass<int> integerTypeCustomGeneric = new CustomGenericClass<>();
    }
}
