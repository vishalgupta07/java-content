package deshaw.ascend.session2.oops.casestudy.v4.mentor;

import deshaw.ascend.session2.oops.casestudy.v4.student.EducareFellow;
import deshaw.ascend.session2.oops.casestudy.v4.student.JuniHer;
import deshaw.ascend.session2.oops.casestudy.v4.student.SeniHer;
import deshaw.ascend.session2.oops.casestudy.v4.studygroup.EducareStudyGroup;
import deshaw.ascend.session2.oops.casestudy.v4.studygroup.EducareStudyGroupMember;
import deshaw.ascend.session2.oops.casestudy.v4.studygroup.EducareStudyGroupRegister;

import java.util.List;


public class EducareStudyGroupMentor extends EducareMentor implements EducareStudyGroupMember {

    public EducareStudyGroupMentor() {
    }

    public EducareStudyGroupMentor(String firstName, String lastName, List<SeniHer> seniHers, List<JuniHer> juniHers) {
        super(firstName, lastName, seniHers, juniHers);
        EducareStudyGroupRegister.registerStudyGroup(this);
    }


    @Override
    public String introduce() {
        return "I am a study group mentor at DESIS Ascend Educare Fellowship. " + super.introduce()
                + " I currently mentor " + getHeadCount() + " educare fellows";
    }

    @Override
    public EducareStudyGroup getMyStudyGroup() {
        return EducareStudyGroupRegister.getStudyGroupForEducareMentor(this);
    }

    @Override
    public void enterDoubtClearingSession() {
        EducareStudyGroup educareStudyGroup = getMyStudyGroup();
        String educareFellowNames = educareStudyGroup.getEducareFellows().stream()
                .map(EducareFellow::getLegalName)
                .reduce("", (name1, name2) -> name1 + ", " + name2);
        System.out.println("I will help to clear doubts for following fellows: " + educareFellowNames);
    }
}
