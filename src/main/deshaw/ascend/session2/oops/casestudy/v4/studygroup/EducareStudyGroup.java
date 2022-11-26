package deshaw.ascend.session2.oops.casestudy.v4.studygroup;

import deshaw.ascend.session2.oops.casestudy.v4.mentor.EducareStudyGroupMentor;
import deshaw.ascend.session2.oops.casestudy.v4.student.EducareFellow;

import java.util.List;

/**
 * Model for educare study group
 */
public class EducareStudyGroup {

    /**
     * List of educare fellows
     */
    private List<EducareFellow> educareFellows;

    /**
     * Educare study group mentor
     */
    private EducareStudyGroupMentor educareStudyGroupMentor;

    // Constructor
    public EducareStudyGroup(List<EducareFellow> educareFellows, EducareStudyGroupMentor educareStudyGroupMentor) {
        this.educareFellows = educareFellows;
        this.educareStudyGroupMentor = educareStudyGroupMentor;
    }

    // Getters
    public List<EducareFellow> getEducareFellows() {
        return educareFellows;
    }

    public EducareStudyGroupMentor getEducareStudyGroupMentor() {
        return educareStudyGroupMentor;
    }
}
