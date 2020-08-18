package src.chapter5.question4;

public class Question4 {
    public static String concatStringsOfArray(String[] strArray) {

        if (strArray == null) {
            return null;
        }
        StringBuilder currentString = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] != null) {
                currentString.append(strArray[i]);
            }
        }
        return currentString.toString();
    }


}
