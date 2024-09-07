package learn.multithreading;

class WhiteBoard {
  String text;
  int numberOfStudents = 0;
  int count = 0;

  public void attendance() {
    numberOfStudents++;
  }

  synchronized public void write(String t) {
    System.out.println("Teacher is Writing " + t);
    while (count != 0) {
      try {
        wait();
      } catch (Exception e) {
      }
    }
    text = t;
    count = numberOfStudents;
    notifyAll();
  }

  synchronized public String read() {
    while (count == 0) {
      try {
        wait();
      } catch (Exception e) {
      }
    }
    String t = text;
    count--;
    if (count == 0) {
      notify();
    }
    return t;
  }
}

class Teacher extends Thread {
  WhiteBoard wb;
  String notes[] = { "Java is a Language", "It is OOPS", "It Supports Multithreading", "end" };

  public Teacher(WhiteBoard w) {
    this.wb = w;
  }

  public void run() {
    for (int i = 0; i < notes.length; i++) {
      wb.write(notes[i]);
    }
  }
}

class Student extends Thread {
  String name;
  WhiteBoard wb;

  public Student(String n, WhiteBoard w) {
    this.name = n;
    this.wb = w;
  }

  public void run() {
    String text;
    wb.attendance();

    do {
      text = wb.read();
      System.out.println(name + " Reading " + text);
      System.out.flush();
    } while (!text.equals("end"));
  }
}

public class StudentCh2 {
  public static void main(String[] args) {
    WhiteBoard w = new WhiteBoard();
    Teacher t = new Teacher(w);
    Student st1 = new Student("1. Rahul", w);
    Student st2 = new Student("2. Mohit", w);
    Student st3 = new Student("3. Vishal", w);

    t.start();
    st1.start();
    st2.start();
    st3.start();
  }
}
