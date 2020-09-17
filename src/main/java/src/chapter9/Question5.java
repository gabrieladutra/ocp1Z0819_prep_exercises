package src.chapter9;

public class Question5 {
  public static void printElement(String[][] names) {
    if (names == null) {
      throw new IllegalArgumentException("Array is null");
    }
    for (String[] i : names) {
      for (String name : i) {
        if (name == null) {
          throw new NullPointerException("Value of current index is null");
        }
        System.out.println(name);
      }
    }
}
  public static void main(String[] args) {
    String[][] names = new String[2][3];
    names[0][0] = "word";
    names[0][1] = "not";
    names[0][2] = "way";
    names[1][0] = "sun";
    names[1][1] = "number";
    names[1][2] = "doc";
    printElement(names);
  }
}
