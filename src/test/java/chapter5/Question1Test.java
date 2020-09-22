package chapter5;

import org.junit.jupiter.api.Test;
import static src.chapter5.question1.Question1.*;

import static org.junit.jupiter.api.Assertions.*;

public class Question1Test {
    @Test
    public void isInternedString_whenAStringIsInterned_shouldReturnTrue() {
        assertTrue(isInternedString("hello"));
    }

    @Test
    public void isStringBuilderSubstringInterned_whenAStringIsNotInterned_shouldReturnFalse() {
        assertFalse(isStringBuilderSubstringInterned("hello"));
    }

    @Test
    public void isToStringInterned_whenAToStringIsInterned_shouldReturnTrue(){
        assertTrue(isToStringInterned("hello"));
    }

    @Test
    public void isToStringBuilderInterned_whenAToStringIsNotInterned_shouldReturnFalse(){
        var string  = new StringBuilder("Hello");
        assertFalse(isToStringBuilderInterned(string));
    }

}
