package deshaw.ascend.session2.oops.casestudy.v4.student;

import deshaw.ascend.common.model.course.EducareCourse;
import deshaw.ascend.session2.oops.casestudy.v4.studygroup.EducareStudyGroup;
import deshaw.ascend.session2.oops.casestudy.v4.studygroup.EducareStudyGroupMember;
import deshaw.ascend.session2.oops.casestudy.v4.studygroup.EducareStudyGroupRegister;

import java.util.List;

/**
 * Model for educare fellow
 */
public abstract class EducareFellow extends Student implements EducareStudyGroupMember {

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
     * Method to get educare fellow type
     * @return  Educare fellow type <code>SeniHer</code> or <code>JuniHer</code>
     */
    protected abstract String getEducareFellowType();

    /**
     * {@inheritDoc}
     * @return Introductory message from educare fellow
     */
    @Override
    public String introduce() {
        String courseNames = subscribedCourses.stream()
                .map(EducareCourse::getCourseName)
                .reduce("", (course1, course2) -> course1 + ", " + course2);

        return "I am a " + getEducareFellowType() + " at DESIS Ascend Educare Fellowship. "
                + super.introduce()
                + " I have currently subscribed to these educare course(s): " + courseNames;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EducareStudyGroup getMyStudyGroup() {
        return EducareStudyGroupRegister.getEducareStudyGroupForEducareFellow(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void enterDoubtClearingSession() {
        EducareStudyGroup educareStudyGroup = getMyStudyGroup();
        EducareStudyGroupMember educareStudyGroupMember = educareStudyGroup.getEducareStudyGroupMentor();
        System.out.println("I will get my doubts cleared with help from " + educareStudyGroupMember);
    }
}
