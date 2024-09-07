package learning;

import java.util.List;

public class FP01Old {
    private static void printAllNumbers(List<Integer> nums) {

        for(int num : nums){
            System.out.println(num);
        }
    }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printAllNumbers(numbers);
    }

}
