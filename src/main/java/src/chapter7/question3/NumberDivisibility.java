package src.chapter7.question3;

import java.util.ArrayList;

public class NumberDivisibility {
    private final int number;
    private final boolean isDivisibleBy2;
    private final boolean isDivisibleBy3;
    private final boolean isDivisibleBy5;

    public NumberDivisibility(final int number) {
        this.number = number;
        isDivisibleBy2 = number % 2 == 0;
        isDivisibleBy3 = number % 3 == 0;
        isDivisibleBy5 = number % 5 == 0;
    }

    public ArrayList<String> getTags() {
        ArrayList<String> strArray = new ArrayList<>();
        if (isDivisibleBy2) {
            strArray.add("even");
            if (isDivisibleBy2 && isDivisibleBy3) {
                strArray.add("23");
            }
            if (isDivisibleBy2 && isDivisibleBy3 && isDivisibleBy5) {
                strArray.add("235");
            }
        } else if (isDivisibleBy3) {
            strArray.add("three");
        } else if (isDivisibleBy5) {
            strArray.add("five");
        } else {
            strArray.add("unknown");
        }

        return strArray;
    }

    public void printTags(NumberDivisibility n) {
        System.out.println(n.getTags());
    }

}
