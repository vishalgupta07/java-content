package deshaw.ascend.session2.oops.casestudy.v2;

import deshaw.ascend.common.model.course.EducareCourse;

import java.util.List;

public class JuniHer extends Person {

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

    // Constructor
    public JuniHer() {
    }

    public JuniHer(String firstName, String lastName, String universityName, String degree, List<EducareCourse> subscribedCourses) {
        super(firstName, lastName);
        this.universityName = universityName;
        this.degree = degree;
        this.subscribedCourses = subscribedCourses;
    }

    /**
     * Function to introduce a JuniHer
     * @return  Introductory message from a JuniHer
     */
    public String introduce() {
        String courseNames = subscribedCourses.stream()
                .map(EducareCourse::getCourseName)
                .reduce("", (course1, course2) -> course1 + ", " + course2);
        return "I am a JuniHer at DESIS Ascend Educare Fellowship. " + super.introduce()
                + " I am currently studying at " + universityName + " pursuing " + degree + "."
                + " I have subscribed to following courses: " + courseNames;
    }
}
