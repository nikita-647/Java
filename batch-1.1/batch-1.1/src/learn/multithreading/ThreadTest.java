package learn.multithreading;

class MyRun implements Runnable {
  @Override
  public void run() {
  }
}

class MyThr extends Thread {
  public MyThr(String name) {
    super(name);
    setPriority(Thread.MIN_PRIORITY + 2);
  }

  @Override
  public void run() {
    int count = 1;
    while (true) {
      System.out.println(count++);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    }
  }
}

public class ThreadTest {
  public static void main(String[] args) {
    // Thread t=new Thread(new MyRun(), "MyThread1");
    MyThr t = new MyThr("My Thread 1");
    // System.out.println("ID " + t.getId());
    // System.out.println("Name " + t.getName());
    // System.out.println("Priority " + t.getPriority());
    // t.start();
    // System.out.println("State " + t.getState());
    // System.out.println("Alive " + t.isAlive());
    t.start();
    t.interrupt();
  }
}
