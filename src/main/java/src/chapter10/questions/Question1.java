package src.chapter10.questions;

public class Question1 {
    public static int add(int... numbers){
        if(numbers.length <= 0){
            throw new IllegalArgumentException("The length of array must be greater then 0");
        }
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
