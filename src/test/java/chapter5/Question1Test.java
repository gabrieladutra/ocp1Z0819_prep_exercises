package chapter5;

import org.junit.jupiter.api.Test;
import src.chapter5.question1.Question1;

import static org.junit.jupiter.api.Assertions.*;

public class Question1Test {
    @Test
    public void getInternedString_whenAStringIsInterned_shouldReturnTrue() {
        assertTrue(Question1.isInternedString("hello"));
    }

    @Test
    public void getInternedStringBuilder_whenAStringIsNotInterned_shouldReturnFalse() {
        var str = new StringBuilder("hello");
        assertFalse(Question1.isStringBuilderSubstringInterned());
    }
}
