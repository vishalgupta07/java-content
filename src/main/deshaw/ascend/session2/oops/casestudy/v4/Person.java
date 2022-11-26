package deshaw.ascend.session2.oops.casestudy.v4;


/**
 * Model for person
 */
public abstract class Person {

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

    /**
     * Function to get legal name of person
     * @return  Legal person name
     */
    public String getLegalName() {
        return firstName + " " + lastName;
    }
}
