package src.chapter5.question1;

public class Question1 {
    public static boolean isInternedString(String string) {
        return string == string.substring(0);
    }

    public static boolean isStringBuilderSubstringInterned(String maybeInternedString) {
        var internedString = "hello";
        var stringBuilder = new StringBuilder(internedString);
        maybeInternedString = stringBuilder.substring(0);
        return maybeInternedString == internedString;
    }
}
