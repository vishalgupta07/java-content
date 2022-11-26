package deshaw.ascend.session2.oops.casestudy.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Model for educare study group mentor
 */
public class EducareStudyGroupMentor extends Person {

    /**
     * SeniHer mentees
     */
    private List<SeniHer> seniHers = new ArrayList<>();

    /**
     * JuniHer mentees
     */
    private List<JuniHer> juniHers = new ArrayList<>();

    // Constructors
    public EducareStudyGroupMentor() {
    }

    public EducareStudyGroupMentor(String firstName, String lastName, List<JuniHer> juniHers, List<SeniHer> seniHers) {
        super(firstName, lastName);
        this.juniHers = juniHers;
        this.seniHers = seniHers;
    }

    /**
     * Function to introduce a study group mentor
     * @return  Introductory messge from a study group mentor
     */
    public String introduce() {
        int headCount = seniHers.size() + juniHers.size();
        return "I am a study group mentor at DESIS Ascend Educare Fellowship. " + super.introduce()
                + " I currently mentor " + headCount + " educare fellows";
    }
}
