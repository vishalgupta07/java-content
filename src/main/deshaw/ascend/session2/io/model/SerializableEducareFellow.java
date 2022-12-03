package deshaw.ascend.session2.io.model;

import deshaw.ascend.common.model.course.EducareCourse;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerializableEducareFellow implements Serializable {
    private String myFirstName;
    private String myLastName;
    private String myDegree;
    private String myUniversityName;
    private List<EducareCourse> mySubscribedCourses;

    // Adding this field after serialization should break deserialization.
//     private int myField;

    // Enable the below to avoid InvalidClassException even with additional fields.
     private static final long serialVersionUID = 1L;

    public SerializableEducareFellow(
            String firstName,
            String lastName,
            String degree,
            String universityName,
            List<EducareCourse> subscribedCourses
    ) {
        myFirstName = firstName;
        myLastName = lastName;
        myDegree = degree;
        myUniversityName = universityName;
        // Clone the list to make sure that our list does not get modified
        // when the parameter list gets modified later.
        if (subscribedCourses != null) {
            mySubscribedCourses = new ArrayList<>(subscribedCourses);
        }
        else {
            mySubscribedCourses = Collections.emptyList();
        }
    }

    /**
     * Introduces itself.
     */
    public String introduce() {
        // Get course name with lambda
        final String courseNames;
        if (mySubscribedCourses != null) {
            courseNames =
            mySubscribedCourses.stream()
                               .map(EducareCourse::getCourseName)
                               .reduce((course1, course2) -> course1 + ", " + course2)
                               .orElse("None");
        }
        else {
            courseNames = "None";
        }

        return "My name is " + myFirstName + " " + myLastName +
               ". I am currently studying at " + myUniversityName +
               " pursuing " + myDegree + "." +
               " I have currently subscribed to these educare course(s): " +
               courseNames;
    }

     /**
      * Custom readObject.
      */
     private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
         myFirstName = (String) is.readObject();
         myLastName = (String) is.readObject();
         System.out.println("De-serialized object with custom logic");
     }

     /**
      * Custom writeObject.
      */
     private void writeObject(ObjectOutputStream os) throws IOException {
         // Note that the order of reading and writing is important.
         os.writeObject(myFirstName);
         os.writeObject(myLastName);
         System.out.println("Serialized object with custom logic");
     }
}
