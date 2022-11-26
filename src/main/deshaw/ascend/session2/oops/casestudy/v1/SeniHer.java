package deshaw.ascend.session2.oops.casestudy.v1;

import deshaw.ascend.common.model.course.EducareCourse;

import java.util.List;

/**
 * Model for a senior educare fellow
 */
public class SeniHer {

    /**
     * First name of person
     */
    private String firstName;

    /**
     * Last name of person
     */
    private String lastName;

    /**
     * University name
     */
    private String universityName;

    /**
     * Degree name
     */
    private String degree;

    /**
     * List of subscribed courses
     */
    private List<EducareCourse> subscribedCourses;

    // Constructors
    public SeniHer() {
    }

    public SeniHer(String firstName, String lastName, String universityName, String degree, List<EducareCourse> subscribedCourses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.universityName = universityName;
        this.degree = degree;
        this.subscribedCourses = subscribedCourses;
    }


    /**
     * Function to introduce a SeniHer
     * @return  Introductory message from a SeniHer
     */
    public String introduce() {
        String courseNames = subscribedCourses.stream()
                .map(EducareCourse::getCourseName)
                .reduce("", (course1, course2) -> course1 + ", " + course2);
        return "I am a SeniHer at DESIS Ascend Educare Fellowship. "
                + "My name is " + firstName + " " + lastName + "."
                + " I am currently studying at " + universityName + " pursuing " + degree + "."
                + " I have subscribed to following courses: " + courseNames;
    }
}
