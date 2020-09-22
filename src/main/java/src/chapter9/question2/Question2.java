package src.chapter9.question2;

import java.util.Arrays;

public class Question2 {
    public static int getArrayLength(int[] paramArray){
        if(paramArray == null) throw new IllegalArgumentException("Array is null");
        return paramArray.length;
    }
    public static void printArrayElements(int[] paramArray){
        for(int i : paramArray) System.out.println(i);
        //Arrays.stream(paramArray).forEach(elementoAtual -> System.out.println(elementoAtual));
        //Arrays.stream(paramArray).forEach(System.out::println);
    }
}
