package learn.InputOutputStream;

// import java.io.BufferedInputStream;
// import java.io.BufferedOutputStream;
import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
import java.io.FileReader;

public class BufferDemo {
    public static void main(String[] args) throws Exception {
        FileReader fis = new FileReader("Test.txt");
        BufferedReader bis = new BufferedReader(fis);

        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.mark(10);
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.reset();
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println(bis.readLine());

    }
}