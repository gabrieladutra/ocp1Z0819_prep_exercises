package src.chapter5.question2;

public class Question2 {
    public static String concatWithX(String string) {
        String str = "";
        while (str.length() < string.length() - 4) {
            str += "X";
        }
        String last = string.substring(string.length() - 4);
        return str + last;
    }
}
