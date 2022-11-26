package deshaw.ascend.session2.exception;

import deshaw.ascend.common.model.person.Person;
import deshaw.ascend.common.model.person.student.SeniHer;

public class HandledCustomException {

    public static void main(String[] args) {
        // First name and last name are null so should throw exception
        Person student = new SeniHer();
        student.introduce();
    }
}
