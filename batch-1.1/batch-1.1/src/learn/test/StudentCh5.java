package learn.test;

// Question 5. Implement a function to calculate the factorial of a non-negative integers using recursion.

class factorial {
    int n;

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}

public class StudentCh5 {
    public static void main(String[] args) {
        factorial f = new factorial();
        System.out.println(f.factorial(5));
    }
}
