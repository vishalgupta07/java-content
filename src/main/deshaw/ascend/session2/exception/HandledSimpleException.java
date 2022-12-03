package deshaw.ascend.session2.exception;

import deshaw.ascend.common.model.person.student.JuniHer;
import deshaw.ascend.common.model.person.student.SeniHer;
import deshaw.ascend.common.model.person.student.Student;

import java.util.ArrayList;
import java.util.List;

public class HandledSimpleException {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new JuniHer());
        students.add(new SeniHer());

        // We have only 2 students in the list, but we are trying to access
        // 3rd element. This would throw IndexOutOfBoundsException.
        for (int i = 0; i <= 5; i++) {
            try {
                Student s = students.get(i);
                System.out.println(s.introduce());
            }
//            catch (IllegalArgumentException e) {
//                System.out.println("We got an IllegalArgumentsException.");
//            }
//            catch (IndexOutOfBoundsException e) {
//                // Do nothing. Ignore this exception.
//                System.out.println(e.getMessage());
//            }
            catch (Exception e) {
                System.out.println("Got an exception of type: " + e.getClass());
            }
            finally {
                System.out.println("Completed iteration " + i);
            }
        }
    }
}
