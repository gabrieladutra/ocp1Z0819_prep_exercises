package chapter5;

import org.junit.jupiter.api.Test;
import src.chapter5.question3.Question3;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question3Test {
    @Test
    public void replaceWithX_whenAStringLengthIs4_shouldReturnAStringReplacedWIthX() {
        var strBuilder = new StringBuilder("1234");
        assertEquals("1234", Question3.appendWithX(strBuilder));
    }

    @Test
    public void replaceWithX_whenAStringLengthIsGreaterThan4_shouldReturnAStringReplacedWIthX() {
        var strBuilder = new StringBuilder("123456789");
        assertEquals("XXXXX6789", Question3.appendWithX(strBuilder));
    }

    @Test
    public void replaceWithX_whenAStringLengthIsLessThan4_shouldReturnAStringReplacedWIthX() {
        var strBuilder = new StringBuilder("123");
        assertEquals("123", Question3.appendWithX(strBuilder));
    }
}
