package src.chapter9;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.*;
public class TestClass {
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }

    public static void main(String args[]) throws IOException
    {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9,10,11,12 } };
        print2D(mat);

    int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(firstArray));
        String[] array = new String[3];
        System.out.println(Arrays.toString(array));
        boolean[] booleans = new boolean[3];
        System.out.println(Arrays.toString(booleans));
        int[] nullArray = null;
        int[] emptyArray = new int[] {1};
        System.out.println(Arrays.toString(nullArray));
        System.out.println(emptyArray[0]);
        Object[] objArray = new Object[3];
        Array.setInt(firstArray,1,999);
       System.out.println(Arrays.toString(firstArray));

       String[] myString = new String[] {"payback", "big", "payback"};
        String[] myString3 = new String[] {"payback", "payback", "payback"};
       String[] myString2 = (String[])  myString.clone();
       for(int i = 0; i < myString2.length; i++){
           System.out.println(myString2[i]);
       }
        System.out.println(Arrays.hashCode(myString));
        System.out.println(Arrays.hashCode(myString2));

        var arr = new ArrayList<String>();
        arr.add("oi");

        Number[] numbers = {1,2,3};
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 1.2f;
        numbers[1] = 99999999999L;
        numbers[2] = 1.344545d;
//        System.out.println(Arrays.toString(numbers));
//        Number[] numArray = new Integer[5];
//        System.out.println(numArray instanceof Integer[]);
//        numArray[0] = 1.11d;
        System.out.println(Arrays.mismatch(myString, myString3));
        System.out.println(Arrays.compare(myString, myString3));

        int[][] multidimensional = new int[3][3];
         int[] arr1 = new int[2*3];
        System.out.println("-----------//--------------");
        System.out.println(arr1.length);
        String[][][] countries = new String[2][5][4];

        countries[0][0][0] = "England";
        countries[0][0][1] = "Liverpool";
        countries[0][0][2] = "Westminster";
        countries[0][0][3] = "Wessex";
        countries[1][0][0] = "USA";
        countries[1][1][0] = "New Jersey";
        System.out.println(deepToString(countries));

        int[][] iaa = new int[2][3];
        System.out.println(deepToString(iaa));
    }
}

