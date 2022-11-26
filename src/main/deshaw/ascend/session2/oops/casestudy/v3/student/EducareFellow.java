package deshaw.ascend.session2.oops.casestudy.v3.student;

import deshaw.ascend.common.model.course.EducareCourse;

import java.util.List;

/**
 * Model for educare fellow
 */
public class EducareFellow extends Student {

    /**
     * List of subscribed courses
     */
    private List<EducareCourse> subscribedCourses;

    // Constructors
    public EducareFellow() {
    }

    public EducareFellow(String firstName, String lastName, String universityName, String degree, List<EducareCourse> subscribedCourses) {
        super(firstName, lastName, universityName, degree);
        this.subscribedCourses = subscribedCourses;
    }

    /**
     * {@inheritDoc}
     * @return  Introductory message from educare fellow
     */
    @Override
    public String introduce() {
        String courseNames = subscribedCourses.stream()
                .map(EducareCourse::getCourseName)
                .reduce("", (course1, course2) -> course1 + ", " + course2);

        return super.introduce() + " I have currently subscribed to these educare course(s): " + courseNames;
    }
}
