package learn.test;

// Question 2. Implement a program to read a txt file and parse its contents into a object.

import java.io.*;

class Vehicle {
    int id;
    String name;
    String address;

}

public class StudentCh2 {
    public static void main(String[] args) {
        FileOutputStream fos = new FileOutputStream("users.txt");
        PrintStream ps = new PrintStream(fos);

        Vehicle v1 = new Vehicle();
        v1.id = 1;
        v1.name = "Fortuner";
        v1.address = " Delhi";

        ps.println(v1.id);
        ps.println(v1.name);
        ps.println(v1.address);

        ps.close();
        fos.close();

        // FileInputStream fis = new FileInputStream("source3.txt");
        // BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        // Vehicle v1 = new Vehicle();

        // v1.id = Integer.parseInt(br.readLine());
        // v1.name = br.readLine();
        // v1.address = br.readLine();

        // System.out.println(v1.name);
        // System.out.println(v1.id);
        // System.out.println(v1.address);

    }
}
