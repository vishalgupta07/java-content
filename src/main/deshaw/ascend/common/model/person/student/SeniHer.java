package deshaw.ascend.common.model.person.student;

import deshaw.ascend.common.model.course.EducareCourse;

import java.util.List;

public class SeniHer extends EducareFellow {

    public SeniHer() {
    }

    public SeniHer(String firstName, String lastName, String universityName, String degree, List<EducareCourse> subscribedCourses) {
        super(firstName, lastName, universityName, degree, subscribedCourses);
    }

    /**
     * {@inheritDoc}
     * @return  Introductory message for seniher
     */
    @Override
    public String introduce() {
        return "I am a SeniHer at DESIS Ascend Educare Fellowship. " + super.introduce();
    }
}
