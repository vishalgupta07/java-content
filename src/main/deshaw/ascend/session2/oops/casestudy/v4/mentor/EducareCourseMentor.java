package deshaw.ascend.session2.oops.casestudy.v4.mentor;

import deshaw.ascend.common.model.course.EducareCourse;
import deshaw.ascend.session2.oops.casestudy.v4.student.JuniHer;
import deshaw.ascend.session2.oops.casestudy.v4.student.SeniHer;

import java.util.List;


public class EducareCourseMentor extends EducareMentor {

    /**
     * Designated course content for delivery
     */
    private EducareCourse educareCourse;

    // Constructors
    public EducareCourseMentor() {
    }

    public EducareCourseMentor(String firstName, String lastName, List<SeniHer> seniHers, List<JuniHer> juniHers, EducareCourse educareCourse) {
        super(firstName, lastName, seniHers, juniHers);
        this.educareCourse = educareCourse;
    }

    /**
     * {@inheritDoc}
     * @return  Introductory message from course mentor
     */
    @Override
    public String introduce() {
        return "I am a course mentor at DESIS Ascend Educare Fellowship. "
                + super.introduce()
                + " I am currently delivering contents for " + educareCourse + " to " + getHeadCount() + " educare fellows.";
    }
}
