package deshaw.ascend.session2.oops.casestudy.v1;

import deshaw.ascend.common.model.course.EducareCourse;

import java.util.ArrayList;
import java.util.List;

/**
 * Model for educare course mentor
 */
public class EducareCourseMentor {

    /**
     * First name of person
     */
    private String firstName;

    /**
     * Last name of person
     */
    private String lastName;

    /**
     * Designated course content for delivery
     */
    private EducareCourse educareCourse;

    /**
     * SeniHer mentees
     */
    private List<SeniHer> seniHers = new ArrayList<>();

    /**
     * JuniHer mentees
     */
    private List<JuniHer> juniHers = new ArrayList<>();

    // Constructors
    public EducareCourseMentor() {
    }

    public EducareCourseMentor(String firstName, String lastName, EducareCourse educareCourse, List<SeniHer> seniHers, List<JuniHer> juniHers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.educareCourse = educareCourse;
        this.seniHers = seniHers;
        this.juniHers = juniHers;
    }

    /**
     * Function to introduce an educare course mentor
     * @return  Introductory message from course mentor
     */
    public String introduce() {
        int headCount = seniHers.size() + juniHers.size();
        return "I am a course mentor at DESIS Ascend Educare Fellowship. "
                + "My name is " + firstName + " " + lastName + "."
                + " I am currently delivering contents for " + educareCourse + " to " + headCount + " educare fellows.";
    }
}
