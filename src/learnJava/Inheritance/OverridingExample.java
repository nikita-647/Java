package learnJava.Inheritance;

class TV {
    public void switchON() {
        System.out.println("TV is Switched ON!");
    }

    public void changeChannel() {
        System.out.println("TV Channel is Changes...");
    }
}

class SmartTV extends TV {
    public void switchON() {
        System.out.println("SmartTV is Switched ON!");
    }

    public void changeChannel() {
        System.out.println("SmartTV Channel is Changes...");
    }

    public void browse() {
        System.out.println("SmartTV Browsing...");
    }
}

public class OverridingExample {

    public static void main(String[] args) {
        TV oldTv = new TV();
        oldTv.switchON();
        oldTv.changeChannel();

        SmartTV LG = new SmartTV();
        LG.switchON();
        LG.changeChannel();
        LG.browse();

        TV newTV = new SmartTV();
        newTV.switchON();
        newTV.changeChannel();
        // newTV.browse();
    }
}
