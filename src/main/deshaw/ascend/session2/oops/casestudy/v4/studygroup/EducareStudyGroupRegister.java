package deshaw.ascend.session2.oops.casestudy.v4.studygroup;

import deshaw.ascend.session2.oops.casestudy.v4.mentor.EducareStudyGroupMentor;
import deshaw.ascend.session2.oops.casestudy.v4.student.EducareFellow;

import java.util.ArrayList;
import java.util.List;

/**
 * Data/Register layer for registering a study group
 */
public class EducareStudyGroupRegister {

    /**
     * Static global available list of educare study groups
     */
    private static final List<EducareStudyGroup> educareStudyGroups = new ArrayList<>(List.of());

    /**
     * Function to register a study group by an {@link EducareStudyGroupMentor educare study group mentor}
     * @param educareStudyGroupMentor   Mentor that registers a study group
     */
    public static void registerStudyGroup(EducareStudyGroupMentor educareStudyGroupMentor) {
        EducareStudyGroup educareStudyGroup = getStudyGroupForEducareMentor(educareStudyGroupMentor);
        if (educareStudyGroup == null) {
            List<EducareFellow> educareFellows = new ArrayList<>(List.of());
            educareFellows.addAll(educareStudyGroupMentor.getSeniHers());
            educareFellows.addAll(educareStudyGroupMentor.getJuniHers());

            educareStudyGroups.add(new EducareStudyGroup(educareFellows, educareStudyGroupMentor));
        } else {
            System.out.println("Study group for educare study group mentor - " + educareStudyGroupMentor + " has already" +
                    " been registered");
        }
    }

    /**
     * Function to get study group for an educare mentor
     * @param educareStudyGroupMentor   Educare mentor querying for their study group
     * @return  Required study group
     */
    public static EducareStudyGroup getStudyGroupForEducareMentor(EducareStudyGroupMentor educareStudyGroupMentor) {
        if (educareStudyGroupMentor == null) {
            throw new IllegalArgumentException("Educare study group mentor can not be null");
        }

        return educareStudyGroups.stream()
                .filter(educareStudyGroup -> educareStudyGroup.getEducareStudyGroupMentor().equals(educareStudyGroupMentor))
                .findFirst()
                .get();
    }

    /**
     * Function to get study group for educare fellow
     * @param educareFellow Educare fellow querying for their study group
     * @return  Required study group
     */
    public static EducareStudyGroup getEducareStudyGroupForEducareFellow(EducareFellow educareFellow) {
        if (educareFellow == null) {
            throw new IllegalArgumentException("Educare fellow can not be null");
        }

        return educareStudyGroups.stream()
                .filter(educareStudyGroup -> educareStudyGroup.getEducareFellows().contains(educareFellow))
                .findFirst()
                .get();
    }
}
