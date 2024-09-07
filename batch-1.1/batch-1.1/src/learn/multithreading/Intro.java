package learn.multithreading;

class MyThread extends Thread {
  public void run() {
    int i = 1;
    while (true) {
      System.out.println(i + " Hello");
      i++;
    }
  }
}

public class Intro extends Thread {

  public void run() {
    int i = 1;
    while (true) {
      System.out.println(i + " Hello");
      i++;
    }
  }

  public static void main(String[] args) {

    Intro t = new Intro();
    t.start();

    int i = 1;
    while (true) {
      System.out.println(i + " World");
      i++;
    }
  }
}
