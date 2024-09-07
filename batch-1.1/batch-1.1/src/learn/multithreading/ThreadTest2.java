package learn.multithreading;

class MyThreadNew extends Thread {
  public void run() {
    int count = 1;
    while (true) {
      System.out.println(count++ + " My thread");
    }
  }
}

public class ThreadTest2 {
  public static void main(String[] args) throws Exception {
    MyThreadNew t = new MyThreadNew();
    // t.setDaemon(true);
    t.start();

    // Thread mainThread = Thread.currentThread();
    // mainThread.join();

    int count = 1;
    while (true) {
      System.out.println(count++ + " Main");
      Thread.yield();
    }

  }
}
