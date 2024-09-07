package learn.InputOutputStream;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileInputSreamDemo {
    public static void main(String[] args) throws Exception {

     try(FileReader fis = new FileReader("Test.txt")){

         int x;
         while((x=fis.read()) != -1){
             System.out.println((char)x);
         }



//         do{
//             x = fis.read();
//             if(x != -1)
//             System.out.println((char)x);
//         }while(x != -1);


//         byte b[] = new byte[fis.available()];
//         fis.read(b);
//
//         String str = new String(new byte[]{97, 98, 99});
//         System.out.println(str);
     }
    }
}
