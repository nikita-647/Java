package learn.InputOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws Exception {

        try (FileOutputStream fos = new FileOutputStream("Test.txt")) {
            String str = "Learn Java Programming";
            byte[] b = str.getBytes();


//            Method: 1
//            fos.write(str.getBytes());

//            Method: 2
//            for(byte x : b){
//                fos.write(x);
//            }


//        Method: 3
            fos.write(b, 6, str.length() - 6);
//            fos.close();


//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//
//        }catch (IOException e){
//            System.out.println(e);
//        }
        }
    }
}

