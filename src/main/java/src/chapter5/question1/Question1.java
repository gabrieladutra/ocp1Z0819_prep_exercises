package src.chapter5.question1;

public class Question1 {
    public static boolean isInternedString(String string) {
        return string == string.substring(0);
    }

    public static boolean isToStringInterned(String string) {
        return string == string.toString();
    }

    public static boolean isStringBuilderSubstringInterned(String maybeInternedString) {
        var internedString = "hello";
        var stringBuilder = new StringBuilder(internedString);
        maybeInternedString = stringBuilder.substring(0);
        return maybeInternedString == internedString;
    }

    public static boolean isToStringBuilderInterned(StringBuilder maybeInternedString) {
        return maybeInternedString.equals(maybeInternedString.toString());
    }
}
