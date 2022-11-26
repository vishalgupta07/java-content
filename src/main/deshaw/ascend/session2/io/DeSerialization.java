package deshaw.ascend.session2.io;

import deshaw.ascend.session2.io.model.SerializableEducareFellow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

    /**
     * Main method.
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String inputFileLocation = "src/main/deshaw/ascend/session2/io/output.txt";
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(inputFileLocation));
        Object o1 = in.readObject();
        Object o2 = in.readObject();

        SerializableEducareFellow f1 = (SerializableEducareFellow) o1;
        System.out.println(f1.introduce());

        SerializableEducareFellow f2 = (SerializableEducareFellow) o2;
        System.out.println(f2.introduce());

        // If we try to read any more, we get EOFException.
        // Object o3 = in.readObject();
        in.close();
    }
}
