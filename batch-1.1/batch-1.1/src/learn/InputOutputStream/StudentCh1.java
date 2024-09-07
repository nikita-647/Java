package learn.InputOutputStream;

import java.io.*;

public class StudentCh1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(
                "source1.txt");
        FileOutputStream fos = new FileOutputStream(
                "source2.txt");

        int b;

        while ((b = fis.read()) != -1) {
            System.out.println(b);
        }

        fos.close();
        fis.close();
    }
}
