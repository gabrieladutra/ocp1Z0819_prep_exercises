package src.chapter7.question1;

public class Question1 {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isEvenTernary(int number) {
        return number % 2 == 0 ? true : false;
    }
}