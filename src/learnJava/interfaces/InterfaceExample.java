package learnJava.interfaces;

class Phone {
  public void call() {
    System.out.println("Phone call");
  }

  public void sms() {
    System.out.println("Phone sending sms");
  }
}

interface ICamera {
  void click();

  void record();
}

interface IMusicPlayer {
  void play();

  void pause();

  void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
  public void call() {
    System.out.println("Smart Phone video call");
  }

  public void sms() {
    System.out.println("Smart Phone sending sms");

  }

  public void click() {
    System.out.println("Smart Phone Clicking picture");
  }

  public void record() {
    System.out.println("Smart Phone recoding video");
  }

  public void play() {
    System.out.println("Smart Phone playing music");
  }

  public void pause() {
    System.out.println("Smart Phone Pausing music");
  }

  public void stop() {
    System.out.println("Smart Phone stopping music");

  }
}

public class InterfaceExample {

}
