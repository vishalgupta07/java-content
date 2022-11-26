package deshaw.ascend.session2.oops.casestudy.v4.student;

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
     * @return  Educare fellow type - JuniHer
     */
    @Override
    protected String getEducareFellowType() {
        return "JuniHer";
    }
}
