package deshaw.ascend.common.model.course;

import java.io.Serializable;

public class EducareCourse implements Serializable {
    /**
     * Name of course
     */
    private String courseName;

    /**
     * Is course an elective or a regular run course
     */
    private Boolean isElective;

    public EducareCourse() {
    }

    public EducareCourse(String courseName, Boolean isElective) {
        this.courseName = courseName;
        this.isElective = isElective;
    }

    // Getters

    public String getCourseName() {
        return courseName;
    }

    public Boolean getElective() {
        return isElective;
    }
}
