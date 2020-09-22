package src.chapter5.question3;

public class Question3 {
    public static String appendWithX(StringBuilder string) {
        if (string.length() < 4) {
            return string.toString();
        }
        StringBuilder str = new StringBuilder();
        while (str.length() < string.length() - 4) {
            str.append("X");
        }
        String last = string.substring(string.length() - 4);
        return str + last;
    }
}
