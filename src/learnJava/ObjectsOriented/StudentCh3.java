package learnJava.ObjectsOriented;

class Student{
    int roll;
    String name;
    String course;
    int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }
    public float average() {
        return (float)total()/3;
    }
    public char grade(){
        if(average() >= 60)
            return 'A';
        else 
            return 'B';
    }
    public String details () {
        return "Roll No: " + roll + "\n" + "Name: " + name + "\n" + "Course: " + course + "\n";
    }
}

public class StudentCh3 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Rahul";
        s1.roll = 1111;
        s1.course="MCA";
        s1.m1=70;
        s1.m2=75;
        s1.m3=60;

        System.out.println(s1.total());
        System.out.println(s1.average());
        System.out.println(s1.grade());
        System.out.println(s1.details());
    }
}
