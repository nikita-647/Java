package learn.InputOutputStream;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws Exception {
       RandomAccessFile raf = new RandomAccessFile("randomFile.txt", "rw");

        System.out.println((char)raf.read()); // a
        System.out.println((char)raf.read()); // b
        System.out.println((char)raf.read()); // c
        raf.write('x'); //x
        System.out.println((char)raf.read()); // e
        raf.skipBytes(3);
        System.out.println((char)raf.read()); // i
        System.out.println(raf.getFilePointer()); //9
        raf.seek(raf.getFilePointer() - 3);
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());


    }
}
