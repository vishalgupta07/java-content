package deshaw.ascend.common.model.person;

import deshaw.ascend.common.exception.IntroductionException;

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
     * Function to introduce yourself
     * @return  introductory message from person
     */
    public String introduce() {
        if (firstName == null || lastName == null) {
            throw new IntroductionException();
        }
        return "My name is " + firstName + " " + lastName + ".";
    }

    /**
     * Function to introduce yourself prepended by a greeting
     * @return  introductory message from person with greeting
     */
    public String introduce(String greeting) {
        return greeting + introduce();
    }
}
