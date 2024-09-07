package learning;

import java.util.List;

public class FP01Functional {
//    private static void print(int number){
//        System.out.println(number);
//    }

//    private static void printAllNumbers(List<Integer> numbers) {
//        //{12, 9, 13, 4, 6, 2, 4, 12, 15 }
////        12
////        9
////        13
////        ....
//
////        what to do?
//
////        numbers.forEach(System.out::println); // method reference
//    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    private static void printAllEvenNumbers(List<Integer> numbers) {
//        for (int number : numbers) {
//            if(number % 2 == 0) {
//                System.out.println(number);
//            }
//        }

//        number -> number % 2 == 0
        numbers.stream()
                .filter((number) -> number % 2 == 0)
                .forEach(System.out::println);
    }

//    private static void printAllOddNumbers(List<Integer> numbers) {
//        numbers.stream()
//                .filter((number) -> number % 2 != 0)
//                .forEach(System.out::println);
//    }


    private static void printAllCourse(List<String> course){
        course.stream()
                .forEach(System.out::println);
    }


     private static void printCourseContain(List<String> course){
        course.stream()
                .filter(Course -> course.contains("Spring"))
                .forEach(System.out::println);
}
         private  static void printLetters(List<String> course){
             course.stream()
//                     .filter((Course) -> course.length() >= 4)
                     .forEach(System.out::println);
         }


     private static void printSquareofEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter((number) -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
     }

     private static  void printCubesofEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter((number) -> number % 2 == 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
     }

     private static void printLengthofCourseString(List<String> course) {
        course.stream()
                .filter(course::contains)
                .map(String::length) //alter the sequence
                .forEach(System.out::println);
     }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        List<String> course = List.of("HTML", "CSS", "JAVA", "SPRING BOOT", "AWS", "JAVASCRIPT", "MY SQL");

//        printAllNumbers(numbers);
//        printAllEvenNumbers(numbers);
//        printAllOddNumbers(numbers);

        // 1. print all Course individually
        // 2. print Course containing word "Spring"
        // 3. print Course containing name atleast 3 letters.
        // 4. square of even numbers.


        printAllCourse(course);
        printCourseContain(course);
//        printLetter(course);
        printSquareofEvenNumbers(numbers);

//        1. print the cubes of all odd numbers
        printCubesofEvenNumbers(numbers);

//         2. print the number of characters in each course name.
          printLengthofCourseString(course);
    }

}
