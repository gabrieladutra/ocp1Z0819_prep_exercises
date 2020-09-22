package src.chapter10.questions;

public class Question2{
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

//      Overloaded method -> Same parameters, does not compile because the compiler does not identify whose method will be used
//    public static StringBuilder add(int... numbers){
//        var numberBuilder = new StringBuilder();
//        for(var number : numbers){
//            numberBuilder.append(number);
//        }
//
//        return numberBuilder;
//    }
}