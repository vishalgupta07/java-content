package deshaw.ascend.common.model.person.student;

import deshaw.ascend.common.model.person.Person;

public class Student extends Person {

    private String universityName;

    /**
     * Current degree being pursued
     */
    private String degree;

    // Constructor
    public Student() {
//        staticStudentCount++;
    }

    public Student(String firstName, String lastName, String universityName, String degree) {
        super(firstName, lastName);
        this.universityName = universityName;
        this.degree = degree;
    }

    /**
     * {@inheritDoc}
     * @return  Introductory message for a student
     */
    @Override
    public String introduce() {
        return super.introduce() + " I am currently studying at " + universityName + " pursuing " + degree + ".";
    }
}
