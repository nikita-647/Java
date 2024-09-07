package learnJava.PracticalQuestions;

class Student{
    String Name;
    String RollNumber;

    public Student(String p1 ,String p2 ){

        Name = p1;
        RollNumber = p2;
    }
    
    public String toString(){
        return "Name: " + Name + " RollNumber " + RollNumber;
    }
}

class Studentch1{
    public static void main(String[] args) {
        Student st1=new Student("a", "b");
        Student studentsList[] = {new Student("vishal", "1003"), new Student("Vishu","1004"), new Student("Raj", "1005")}; 
        
        System.out.println(studentsList[0]);
        System.out.println(st1);
    }
}