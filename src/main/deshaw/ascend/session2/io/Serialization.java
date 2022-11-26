package deshaw.ascend.session2.io;

import deshaw.ascend.common.model.course.EducareCourse;
import deshaw.ascend.session2.io.model.SerializableEducareFellow;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serialization {

    public static void main(String[] args) throws IOException {
        String outputFileLocation = "src/main/deshaw/ascend/session2/io/output.txt";
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outputFileLocation));

        SerializableEducareFellow fellow1 = new SerializableEducareFellow(
            "Alpha",
            "Gamma",
            "BTech",
            "Institute of Technology",
            List.of(new EducareCourse("Course 1", false))
        );
        out.writeObject(fellow1);

        SerializableEducareFellow fellow2 = new SerializableEducareFellow(
            "Delta",
            "Beta",
            "BE",
            "Institute of Engineering",
            List.of(new EducareCourse("Course 2", false),
                    new EducareCourse("Course 3", false))
        );
        out.writeObject(fellow2);
        out.close();

        System.out.println(fellow1.introduce());
        System.out.println(fellow2.introduce());
    }
}
