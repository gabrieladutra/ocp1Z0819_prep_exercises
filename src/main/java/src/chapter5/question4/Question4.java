package src.chapter5.question4;

public class Question4 {
    public static String concatStringsOfArray(String[] strArray) {

        if (strArray == null) {
            return null;
        }
        var currentString = strArray[0];
        for (int i = 1; i < strArray.length; i++) {
            if (strArray[i] != null) {
                currentString += strArray[i];
            }
        }
        return currentString;
    }


}
