package learn.multithreading;

class MyRunnable implements Runnable {
  public void run() {
    int i = 1;
    while (i < 2000) {
      System.out.println(i + " Hello");
      i++;
    }
  }
}

public class Part2 {
  public static void main(String[] args) {
    MyRunnable r = new MyRunnable();
    Thread th = new Thread(r);
    th.start();

    int i = 1;
    while (i < 1000) {
      System.out.println(i + " World");
      i++;
    }

  }
}
