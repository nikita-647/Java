package learn.langDemo;

enum Dept {
  CS, IT, CIVIL, ECE
}

public class EnumDemo {
  public static void main(String[] args) {
    Dept d = Dept.ECE;

    // System.out.println(d.ordinal());
    // System.out.println(d.name());
    // System.out.println(Dept.valueOf("IT"));

    // Dept list[] = Dept.values();

    // for (Dept x : list) {
    // System.out.println(x);
    // }

    switch (d) {
      case CS:
        System.out.println("Head: Rahul \nBlock: A");
        break;
      case IT:
        System.out.println("Head: Vishal \nBlock: B");
        break;
      case CIVIL:
        System.out.println("Head: Mohit \nBlock: C");
        break;
      case ECE:
        System.out.println("Head: Raj \nBlock: D");
        break;
    }
  }
}
