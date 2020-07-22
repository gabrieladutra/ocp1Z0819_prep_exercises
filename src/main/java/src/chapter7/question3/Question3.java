package src.chapter7.question3;

public class Question3 {
    public static void printDivisibility(int number) {
        final boolean divisibleBy2 = number % 2 == 0;
        final boolean divisibleBy3 = number % 3 == 0;
        final boolean divisibleBy5 = number % 5 == 0;

        if (divisibleBy2) {
            System.out.println("even");
        }
        if (divisibleBy2 && divisibleBy3) {
            System.out.println("23");
        } else if (divisibleBy3) {
            System.out.println("thee");
        } else if (divisibleBy5) {
            System.out.println("five");
        }
        if (divisibleBy2 && divisibleBy3 && divisibleBy5) {
            System.out.println("235");
        } else {
            System.out.println("unknown");
        }
    }
}
