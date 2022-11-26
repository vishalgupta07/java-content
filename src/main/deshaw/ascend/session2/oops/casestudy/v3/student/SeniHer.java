package deshaw.ascend.session2.oops.casestudy.v3.student;

import deshaw.ascend.common.model.course.EducareCourse;

import java.util.List;

/**
 * Model for senior educare fellows
 */
public class SeniHer extends EducareFellow {

    // Constructors
    public SeniHer() {
    }

    public SeniHer(String firstName, String lastName, String universityName, String degree, List<EducareCourse> subscribedCourses) {
        super(firstName, lastName, universityName, degree, subscribedCourses);
    }

    /**
     * {@inheritDoc}
     * @return  Introductory message from SeniHer
     */
    @Override
    public String introduce() {
        return "I am a SeniHer at DESIS Ascend Educare Fellowship. " + super.introduce();
    }
}
