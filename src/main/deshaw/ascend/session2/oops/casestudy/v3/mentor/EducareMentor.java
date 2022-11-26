package deshaw.ascend.session2.oops.casestudy.v3.mentor;

import deshaw.ascend.session2.oops.casestudy.v3.Person;
import deshaw.ascend.session2.oops.casestudy.v3.student.JuniHer;
import deshaw.ascend.session2.oops.casestudy.v3.student.SeniHer;

import java.util.ArrayList;
import java.util.List;

/**
 * Model for educare mentor
 */
public class EducareMentor extends Person {

    /**
     * SeniHer mentees
     */
    private List<SeniHer> seniHers = new ArrayList<>();

    /**
     * JuniHer mentees
     */
    private List<JuniHer> juniHers = new ArrayList<>();

    // Constructors
    public EducareMentor() {
    }

    public EducareMentor(String firstName, String lastName, List<SeniHer> seniHers, List<JuniHer> juniHers) {
        super(firstName, lastName);
        this.seniHers = seniHers;
        this.juniHers = juniHers;
    }

    /**
     * Function to get head count for educare fellows that are being mentored
     * @return  Head count of educare fellows
     */
    protected Integer getHeadCount() {
        return seniHers.size() + juniHers.size();
    }
}
