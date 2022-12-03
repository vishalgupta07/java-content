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

import deshaw.ascend.common.model.person.student.EducareFellow;
import deshaw.ascend.common.model.person.student.JuniHer;
import deshaw.ascend.common.model.person.student.SeniHer;

import java.util.ArrayList;
import java.util.List;

/**
 * Class contains examples to explain wildcards in Java generics
 */
public class WildCard {

    public static void readFellow(EducareFellow educareFellow) {
        System.out.println("Reading details for " + educareFellow);
    }

    public static void readFellows(List<EducareFellow> educareFellowList) {
        for (EducareFellow educareFellow: educareFellowList) {
            readFellow(educareFellow);
        }
    }

    public static <T> void copy(List<? extends T> from, List<T> to) {
        for (T element: from) {
            to.add(element);
        }
    }

    public static void main(String[] args) {
        JuniHer juniHer = new JuniHer();
        SeniHer seniHer = new SeniHer();
//        readFellow(juniHer);
//        readFellow(seniHer);

        List<JuniHer> juniHers = new ArrayList<>(List.of(juniHer));
        List<SeniHer> seniHers = new ArrayList<>(List.of(seniHer));
//        readFellows(juniHers);
//        readFellows(seniHers);

        List<EducareFellow> educareFellowList1 = new ArrayList<>();
        List<EducareFellow> educareFellowList2 = new ArrayList<>();
        copy(educareFellowList1, educareFellowList2);

        copy(juniHers, educareFellowList1);
//        copy(educareFellowList1, juniHer);
    }
}
