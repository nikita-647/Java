package learnJava.conditionalStatement;

public class IfElseDemo {
  public static void main(String[] args) {
    
    /*
    // * if_else statement
    
    int num = -10;

    if(num >= 0) {
      System.out.println("positive");
    } else {
      System.out.println("negative");
    }


    // * nested if_else statement

    String subject = "Science";
    int score = 91;

    if(subject.equals("English")) {
      System.out.println("Subject: English");
      if(score > 90){
        System.out.println("Grade: A");
      }
      else{
        System.out.println("Grade: B");
      }
    } else {
      System.out.println("Subject: Science");
      if(score > 90){
        System.out.println("Grade: A");
      }
      else{
        System.out.println("Grade: B");
      }
    }


    //*  If_else Ladder statement
    
    int dice = 8;
    
    if(dice == 1){
      System.out.println("Dice roll: 1");
    } else if(dice == 2) {
      System.out.println("Dice roll: 2");
    } else if(dice == 3) {
      System.out.println("Dice roll: 3");
    } else if(dice == 4) {
      System.out.println("Dice roll: 4");
    } else if(dice == 5) {
      System.out.println("Dice roll: 5");
    } else if(dice == 6) {
      System.out.println("Dice roll: 6");
    } else {
      System.out.println("Invalid dice roll");
    }

    //* larger number in 3 numbers

    int a=11, b=12, c=10;

    if(a > b && a > c) {
      System.out.println(a);
    } else if(b > c) {
      System.out.println(b);
    } else {
      System.out.println(c);
    }

    //* 1. Find if a number is odd or even
    int num = 232;

    if(num % 2 == 0){
      System.out.println(num + " is a even number.");
    } else {
      System.out.println(num + " is a odd number.");
    }

    
    //* 2. Find if a person eligible for vote or note
    
    int age = 23;
    
    if(age >=  18){
      System.out.println("User is eligible for vote.");
    } else {
      System.out.println("User is NOT eligible for vote.");
    }
    
    //* 3. Find radix of a number given number in a string

    Scanner sc=new Scanner(System.in);
    String numStr;

    System.out.println("Enter a number: ");
    numStr = sc.nextLine();

    if(numStr.matches("[01]+"))
    {
      System.out.println("Binary Radix=2");
    } 
    else if(numStr.matches("[0-7]+"))
    {
      System.out.println("Octal Radix=8");
    }
    else if(numStr.matches("[0-9]+"))
    {
      System.out.println("Decimal Radix=10");
    }
    else if(numStr.matches("[0-9a-fA-F]+"))
    {
      System.out.println("HexaDecimal Radix=16");
    }
    else {
      System.out.println("Not a number");
    }
    */

    String url = "http://www.google.com";
    
		int index = url.indexOf(':');
    String protocol = url.substring(0, index);
    
		if(protocol.equals("http")) {
			System.out.println("Protocol is : hyper text transfer protocol");
		}
		else if(protocol.equals("ftp")) {
			System.out.println("Protocol is : file transfer protocol");
		}
		else {
			System.out.println("Invalid Protocol");
		}
		
		String ext = url.substring(url.lastIndexOf('.')+1);

		if(ext.equals("com")) {
			System.out.println("This is a Commercial website");
		}
		else if(ext.equals("org")) {
			System.out.println("This is a Organization website");
		}
		else if(ext.equals("net")) {
			System.out.println("This is a Network  website");
		}
		else {
			System.out.println("Invalid Website");
		}

  }
}
