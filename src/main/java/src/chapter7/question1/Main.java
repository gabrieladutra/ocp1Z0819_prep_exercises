package src.chapter7.question1;

public class Main {
    public static void isEvenOrOdd(int number) {
        if (number % 2 == 0) System.out.println(number + " is even");
        else System.out.println(number + " is odd");
        System.out.println(number % 2 == 0 ? "ever" : "odd");

    }
}