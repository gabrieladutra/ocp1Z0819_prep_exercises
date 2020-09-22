package src.chapter7.question2;

public class Question2 {
    public static int sumNumbersUpTo(int number) {
        final int min = 0;
        final int max = 5;
        if (number < min || number > max)
            throw new OutOfRangeException(min, max, number);
        switch (number) {
            case 5:
                number += 4;
            case 4:
                number += 3;
            case 3:
                number += 2;
            case 2:
                number += 1;
        }
        return number;
    }
}
