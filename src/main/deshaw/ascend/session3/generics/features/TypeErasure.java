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

import deshaw.ascend.common.model.person.student.JuniHer;
import deshaw.ascend.common.model.person.student.SeniHer;
import deshaw.ascend.session3.generics.limitations.BoundedCustomGenericClass;
import deshaw.ascend.session3.generics.limitations.CustomGenericClass;

/**
 * Class to explain type erasure in Java
 */
public class TypeErasure {

    public static void main(String[] args) {
        // What type erasure means?
        CustomGenericClass<JuniHer> juniHerCustomGenericClass = new CustomGenericClass<>();
        CustomGenericClass<SeniHer> seniHerCustomGenericClass = new CustomGenericClass<>();
        System.out.println(juniHerCustomGenericClass);
        System.out.println(seniHerCustomGenericClass);

        // Calling a static method (Not CustomGenericClass<JuniHer>.foo())
        CustomGenericClass.foo();

        // Bounds of a generic class
        CustomGenericClass.foo();
        BoundedCustomGenericClass.foo();
    }
}
