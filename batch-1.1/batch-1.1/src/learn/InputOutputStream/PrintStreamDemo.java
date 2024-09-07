package learn.InputOutputStream;

import java.io.*;

class User{
    int id;
    String name;
    String address;

}

public class PrintStreamDemo {
    public static void main(String[] args) throws Exception{
//        FileInputStream fis = new FileInputStream("users.txt");
//        DataInputStream  dis = new DataInputStream(fis);
//
//        User u2 = new User();
//        u2.id = dis.readInt();
//        u2.name = dis.readUTF();
//        u2.address = dis.readUTF();
//
//        System.out.println(u2.id);
//        System.out.println(u2.name);
//        System.out.println(u2.address);


        FileOutputStream fos = new FileOutputStream("users.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        User u1 = new User();
        u1.id = 1;
        u1.name = "Rahul";
        u1.address = " Mumbai";

        dos.writeInt(u1.id);
        dos.writeUTF(u1.name);
        dos.writeUTF(u1.address);

        dos.close();
        fos.close();



//        FileOutputStream fos = new FileOutputStream("users.txt");
//        PrintStream ps = new PrintStream(fos);
//
//        User u1 = new User();
//        u1.id = 1;
//        u1.name = "Mohit";
//        u1.address = " Delhi";
//
//        ps.println(u1.id);
//        ps.println(u1.name);
//        ps.println(u1.address);
//
//        ps.close();
//        fos.close();

//        FileInputStream fis = new FileInputStream("users.txt");
//        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
//
//        User u2 = new User();
//        u2.id = Integer.parseInt(br.readLine());
//        u2.name = br.readLine();
//        u2.address = br.readLine();
//
//        System.out.println(u2.id);
//        System.out.println(u2.name);
//        System.out.println(u2.address);
    }
}
