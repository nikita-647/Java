package learn.InputOutputStream;
import java .io.*;

class Teacher extends Thread{
    OutputStream os;

    public Teacher(OutputStream o){
        os = o;
    }
    public void run(){
        int count = 1;
        while(true){
            try{
                os.write((count));
                os.flush();
                System.out.println("Teacher" + count);
                Thread.sleep(10);
                count++;
            }catch(Exception e){}
        }
    }
}

class Student extends Thread{
    InputStream is;

    public Student(InputStream i){
        is = i;
    }
    public void run(){
        int x;

        while (true){
            try{
                x = is.read();
                System.out.println("Student" + x);
                System.out.flush();
            }catch(Exception e){}
        }
    }
}

public class PipedDemo {
    public static void main(String[] args)  throws Exception{
           PipedInputStream pis = new PipedInputStream();
           PipedOutputStream pos = new PipedOutputStream();

           pos.connect(pis);

           Teacher t = new Teacher(pos);
           Student s = new Student(pis);
           s.start();
           t.start();
    }
}
