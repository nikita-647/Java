package learnJava.PracticalQuestions;

public class Question1 {
    public static void main(String[] args) {
        // Convert decimal to Any base
        // System.out.println(getValueInBase(694, 8));
        // System.out.println(getValueInBase(55, 2));
        // System.out.println(getValueInBase(371, 8));

        // System.out.println(getValueInDecimal(110111, 2));
        // Convert Any base to decimal
        System.out.println(getValue(17, 8, 2));
        System.out.println(getValue(245, 8, 3));
    }

    static int getValueInBase (int n, int b){
        int rv = 0;

        int p=1;
        while(n > 0) {
            int dig = n % b;
            n = n / b;
            rv = rv + dig*p;

            p=p*10;
        }
        
        return rv;
    }
    static int getValueInDecimal (int n, int b){
        int rv = 0;

        int p=1;
        while(n > 0) {
            int dig = n % 10;
            n = n / 10;
            rv = rv + dig*p;

            p=p*b;
        }
        
        return rv;
    }
    static int getValue(int n, int b1, int b2){
        int decNum = getValueInDecimal(n, b1);
        int result = getValueInBase(decNum, b2);
        return result;
    }
}
