package deshaw.ascend.session2.oops.casestudy.v4.studygroup;

/**
 * Interface to implement educare study group member
 */
public interface EducareStudyGroupMember {

    /**
     * Function to get user's study group
     * @return  Required {@link EducareStudyGroup educare study group}
     */
    EducareStudyGroup getMyStudyGroup();

    /**
     * Function to simulate doubt clearing sessions for a study group
     */
    void enterDoubtClearingSession();
}
