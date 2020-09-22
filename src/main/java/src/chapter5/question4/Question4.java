package src.chapter5.question4;

public class Question4 {
    public static String concatStringsOfArray(String[] strArray) {
        if (strArray == null) {
            return null;
        }
        if (strArray.length <= 0) {
            throw new IllegalArgumentException("The  array of parameter is empty");
        }
        StringBuilder currentString = new StringBuilder();
        for (String s : strArray) {
            if (s != null) {
                currentString.append(s);
            }
        }
        return currentString.toString();
    }


}
