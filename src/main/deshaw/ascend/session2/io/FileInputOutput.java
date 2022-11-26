package deshaw.ascend.session2.io;

import java.io.*;

/**
 * Demonstrates file I/O using FileInputStream and FileOutputStream.
 */
public class FileInputOutput {

    private static final String baseFileIOLocation = "src/main/deshaw/ascend/session2/io/";

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(baseFileIOLocation + "input.txt");
        System.out.println("Available bytes to read: " + is.available());
        System.out.println("Reading first 20 bytes.");
        for (int i = 0; i < 20; i++) {
            System.out.print((char) is.read());
        }

        System.out.println();
        System.out.println("Now skipping next 20 bytes.");
        is.skip(20);

        System.out.println();
        System.out.println("Available bytes to read: " + is.available());
        System.out.println("Reading next 20 bytes.");
        byte[] b = new byte[20];
        is.read(b);
        System.out.println(new String(b));

        System.out.println();
        System.out.println("Reading the remaining file");
        int v;
        String remainingPart = "";
        while ((v = is.read()) != -1) {
            remainingPart += (char) v;
        }
        System.out.println(remainingPart);

        is.close();

        // Then do output.
        OutputStream os = new FileOutputStream(baseFileIOLocation + "output.txt");
        b = remainingPart.getBytes();
        os.write(b);
        os.close();
    }
}
