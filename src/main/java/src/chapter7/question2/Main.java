package src.chapter7.question2;

public class Main {
    public static void getSum(int number) {
        if (number >= 0 && number <= 5) {
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
        }
        System.out.println(number);
    }
}
