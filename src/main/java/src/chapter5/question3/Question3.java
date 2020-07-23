package src.chapter5.question3;

public class Question3 {
    public static String replaceWithX(StringBuilder string) {
        String str = "";
        while (str.length() < string.length() - 4) {
            str += "X";
        }
        String last = string.substring(string.length() - 4);
        return str + last;
    }
}
