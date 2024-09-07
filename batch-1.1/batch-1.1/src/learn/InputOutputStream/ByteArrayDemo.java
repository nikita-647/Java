package learn.InputOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ByteArrayDemo {
    public static void main(String[] args) throws Exception {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        bos.write('p');
        bos.write('q');

        bos.write('r');

        bos.write('s');

        bos.writeTo(new FileOutputStream("ByteArrayDemo.txt"));

        // byte[] b = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };

        // ByteArrayInputStream bis = new ByteArrayInputStream(b);

        // int x;
        // while((x=bis.read())!=-1){
        // System.out.println((char)x);
        // }

        // String str = new String(bis.readAllBytes());
        // System.out.println(str);
        // bis.close();

    }
}
