package src.chapter9;

public class Question3 {
  public static char[] getNextPositions(char[] charArray) {
    if (charArray == null || charArray.length == 0) {
      throw new IllegalArgumentException("Array is null or the length  is 0");
    }
    char[] newCharArray = new char[charArray.length - 1];
    for (int i = 1; i < charArray.length; i++) {
      newCharArray[i - 1] = charArray[i];
    }
    return newCharArray;
  }
}
