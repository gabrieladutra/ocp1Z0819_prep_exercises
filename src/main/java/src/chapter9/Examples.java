package src.chapter9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Examples {
  public static void print2D(int[][] mat) {
    // Loop through all rows
    for (int[] row : mat)

      // converting each row as string
      // and then printing in a separate line
      System.out.println(Arrays.toString(row));
  }

  public static void main(String[] args) {
    int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    print2D(mat);

    int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] array = new String[3];
    boolean[] booleans = new boolean[3];
    int[] nullArray = null;
    int[] emptyArray = new int[] {1};
    Object[] objArray = new Object[3];
    Array.setInt(firstArray, 1, 999);

    String[] myString = new String[] {"back", "big", "back"};
    String[] myString3 = new String[] {"back", "back", "back"};
    String[] myString2 = (String[]) myString.clone();

    Number[] numbers = {1, 2, 3};
    numbers[0] = 1.2f;
    numbers[1] = 99999999999L;
    numbers[2] = 1.344545d;
    //        Number[] numArray = new Integer[5];
    //        numArray[0] = 1.11d;

    int[][] multidimensional = new int[3][3];
    int[] arr1 = new int[2 * 3];
    String[][][] countries = new String[2][5][4];

    countries[0][0][0] = "England";
    countries[0][0][1] = "Liverpool";
    int[][] iaa = new int[2][3];
    int[][] iaa2 = {{1, 2}, {99, 2, 3, 3, 99}};
    //        for (int[] ints : iaa2) {
    //            for (int anInt : ints) {
    //                System.out.print(anInt + " ");
    //            }
    //        }
    int[][][] triArray = new int[][][] {{{44, 22, 33}, {23, 55, 67}}};
    for (int[][] i : triArray) {
      for (int[] j : i) {
        for (int k : j) {
          System.out.println(k);
        }
      }
    }
  }
}
