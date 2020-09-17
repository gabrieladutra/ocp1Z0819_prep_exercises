package src.chapter5.question1;

public class Question1 {
    public static boolean isInternedString(final String string) {
        return string.equals(string.substring(0));
    }

    public static boolean isStringBuilderSubstringInterned() {
        var internedString = "hello";
        var stringBuilder = new StringBuilder(internedString);
        var maybeInternedString = stringBuilder.substring(0);
        return maybeInternedString == internedString;
    }
}
