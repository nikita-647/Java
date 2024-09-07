package learn.multithreading;

class MyData {
  // public void display(String str) {
  // synchronized (this) {
  // for (int i = 0; i < str.length(); i++) {
  // System.out.print(str.charAt(i));
  // }
  // }
  // }

  synchronized public void display(String str) {
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i));
    }
  }
}

class MyThread10 extends Thread {
  MyData d;

  public MyThread10(MyData d) {
    this.d = d;
  }

  public void run() {
    d.display("Hello World");
  }
}

class MyThread20 extends Thread {
  MyData d;

  public MyThread20(MyData d) {
    this.d = d;
  }

  public void run() {
    d.display("Welcome All");
  }
}

public class SyncDemo {
  public static void main(String[] args) {
    MyData d = new MyData();
    MyThread10 mt1 = new MyThread10(d);
    MyThread20 mt2 = new MyThread20(d);

    mt1.start();
    mt2.start();

  }
}
