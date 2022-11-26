package deshaw.ascend.session2.oops.casestudy.v3.student;

import deshaw.ascend.session2.oops.casestudy.v3.Person;

/**
 * Model for a generic student
 */
public class Student extends Person {

    /**
     * University currently studying at
     */
    private String universityName;

    /**
     * Current degree being pursued
     */
    private String degree;

    // Constructor
    public Student() {
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
