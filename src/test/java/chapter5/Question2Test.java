package chapter5;

import org.junit.jupiter.api.Test;
import src.chapter5.question2.Question2;
import src.chapter5.question3.Question3;

import static org.junit.jupiter.api.Assertions.*;

public class Question2Test {
    @Test
    public void concatWithX_whenAStringLengthIs4_shouldReturnAStringReplacedWIthX() {
        assertEquals("1234", Question2.concatWithX("1234"));
    }

    @Test
    public void concatWithX_whenAStringLengthIsGreaterThan4_shouldReturnAStringReplacedWIthX() {
        assertEquals("XXXXX6789", Question2.concatWithX("123456789"));
    }

    @Test
    public void concatWithX_whenAStringLengthIsLessThan4_shouldReturnAStringReplacedWIthX() {
        assertEquals("123", Question2.concatWithX("123"));
    }
}
