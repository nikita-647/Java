package learnJava.variablesDataTypes;
import java.util.Scanner;

class KeyBRead {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		// this is an example of comments...
		//int a, b;
		//System.out.println("Please enter two numbers:");

		//a = sc.nextInt();
		//b = sc.nextInt();
		//int c = a+b;
		//System.out.println("Sum is: " + c);

		String word;
		System.out.println("Enter your Favourite words: ");
		//word = sc.next();
		word = sc.nextLine();
		System.out.println("You entered: " + word);
	}
}