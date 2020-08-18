package src.chapter5.question2;

public class Question2 {
    public static String concatWithX(String string) {
        if (string.length() < 4) {
            return string;
        }
        StringBuilder str = new StringBuilder();
        while (str.length() < string.length() - 4) {
            str.append("X");
        }
        String last = string.substring(string.length() - 4);
        return str + last;
    }
}
