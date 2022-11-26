package deshaw.ascend.session2.oops.casestudy.v3.mentor;

import deshaw.ascend.session2.oops.casestudy.v3.student.JuniHer;
import deshaw.ascend.session2.oops.casestudy.v3.student.SeniHer;

import java.util.List;

/**
 * Model for educare study group mentor
 */
public class EducareStudyGroupMentor extends EducareMentor {

    // Constructors
    public EducareStudyGroupMentor() {
    }

    public EducareStudyGroupMentor(String firstName, String lastName, List<SeniHer> seniHers, List<JuniHer> juniHers) {
        super(firstName, lastName, seniHers, juniHers);
    }


    /**
     * {@inheritDoc}
     * @return  Introductory messge from a study group mentor
     */
    @Override
    public String introduce() {
        return "I am a study group mentor at DESIS Ascend Educare Fellowship. "
                + super.introduce()
                + " I currently mentor " + getHeadCount() + " educare fellows";
    }
}
