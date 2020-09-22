package src.chapter9.question4;

public class Question4 {
  public static void printStringLength(String[][] arrayOfString) {
    for (String[] i : arrayOfString) {
      for (String j : i) {
        System.out.println(j.length());
      }
    }
  }
}
