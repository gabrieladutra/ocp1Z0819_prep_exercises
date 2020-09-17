package src.chapter10.questions;

public class Question1 {
    public static int add(int... numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
