package learn.collectionFramework;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokanizerDemo {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("C:/Users/Aman/Desktop/MyData.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);

        String data = new String(b);

        StringTokenizer stk = new StringTokenizer(data, ",");

        String s;
        ArrayList<Integer> al = new ArrayList<>();

        while ((stk.hasMoreTokens())) {
            s = stk.nextToken();
            al.add(Integer.valueOf(s));
        }

        System.out.println(al);

        /*
         * String data = "name=Rahul;address=Delhi;country=India;age=26";
         * 
         * StringTokenizer stk=new StringTokenizer(data, "=;");
         * 
         * String s;
         * 
         * while ((stk.hasMoreTokens())){
         * s=stk.nextToken();
         * System.out.println(s);
         * }
         */

    }
}
