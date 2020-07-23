package src.chapter5.question1;

public class Question1 {
    public static boolean isInternedString(String string) {
        return string == string.substring(0);
    }

    public static boolean isStringBuilderSubstringInterned() {
        var internedString = "hello";
        var stringBuilder = new StringBuilder(internedString);
        var maybeInternedString = stringBuilder.substring(0);
        return maybeInternedString == internedString;
    }
}
