package deshaw.ascend.session2.oops.polymorphism;

import deshaw.ascend.common.model.person.student.Student;

/**
 * Class to demonstrate compile time polymorphism
 *
 * Contract for overloading:
 * <ul>
 *     <li>The return types can be different</li>
 *     <li> You can't change ONLY the return type</li>
 *     <li>You can vary the access levels in any direction</li>
 * </ul>
 */
public class CompileTimePolymorphism {

    public static void main(String[] args) {
        Student student = new Student("Jane", "Doe", "XYZ", "Undergrad B.Tech");

        System.out.println(student.introduce());;
        System.out.println(student.introduce("Hello!"));;
    }
}