package deshaw.ascend.session2.oops.casestudy.v2;

import deshaw.ascend.common.model.course.EducareCourse;

import java.util.ArrayList;
import java.util.List;

/**
 * Model for educare course mentor
 */
public class EducareCourseMentor extends Person {

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

    public EducareCourseMentor(String firstName, String lastName, List<SeniHer> seniHers, List<JuniHer> juniHers, EducareCourse educareCourse) {
        super(firstName, lastName);
        this.seniHers = seniHers;
        this.juniHers = juniHers;
        this.educareCourse = educareCourse;
    }

    /**
     * Function to introduce an educare course mentor
     * @return  Introductory message from course mentor
     */
    public String introduce() {
        int headCount = seniHers.size() + juniHers.size();
        return "I am a course mentor at DESIS Ascend Educare Fellowship. "
                + super.introduce()
                + " I am currently delivering contents for " + educareCourse + " to " + headCount + " educare fellows.";
    }
}
