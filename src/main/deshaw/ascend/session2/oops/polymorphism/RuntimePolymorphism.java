package deshaw.ascend.session2.oops.polymorphism;

import deshaw.ascend.common.model.course.EducareCourse;
import deshaw.ascend.common.model.person.student.JuniHer;
import deshaw.ascend.common.model.person.student.Student;

import java.util.List;

/**
 * Class to demonstrate run time polymorphism
 *
 * Contract of method overriding:
 * <ul>
 *     <li>Arguments must be the same, and return types must be compatible</li>
 *     <li>The method can't be less accessible</li>
 * </ul>
 */
public class RuntimePolymorphism {

    public static void main(String[] args) {
        Student student = new Student("Jane", "Doe", "XYZ", "Undergrad B.Tech");
        System.out.println(student.introduce());

        Student juniHer = new JuniHer("Jane", "Doe", "XYZ", "Undergrad B.Tech",
                List.of(new EducareCourse("Java", true)));
        System.out.println(juniHer.introduce());
    }
}
