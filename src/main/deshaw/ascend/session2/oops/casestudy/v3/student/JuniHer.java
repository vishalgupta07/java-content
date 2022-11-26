package deshaw.ascend.session2.oops.casestudy.v3.student;

import deshaw.ascend.common.model.course.EducareCourse;

import java.util.List;

/**
 * Model for junior educare fellow
 */
public class JuniHer extends EducareFellow {

    // Constructors
    public JuniHer() {
    }

    public JuniHer(String firstName, String lastName, String universityName, String degree, List<EducareCourse> subscribedCourses) {
        super(firstName, lastName, universityName, degree, subscribedCourses);
    }

    /**
     * {@inheritDoc}
     * @return  Introductory message from JuniHer
     */
    @Override
    public String introduce() {
        return "I am a JuniHer at DESIS Ascend Educare Fellowship. " + super.introduce();
    }
}
