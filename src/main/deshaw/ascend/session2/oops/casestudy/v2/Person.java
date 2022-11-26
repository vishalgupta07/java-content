package deshaw.ascend.session2.oops.casestudy.v2;

/**
 * Model for person
 */
public class Person {

    /**
     * First name of person
     */
    private String firstName;

    /**
     * Last name of person
     */
    private String lastName;

    // Constructors
    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Function to introduce a person
     * @return  introductory message from person
     */
    public String introduce() {
        return "My name is " + firstName + " " + lastName + ".";
    }
}
