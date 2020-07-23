package chapter5;

import org.junit.jupiter.api.Test;
import src.chapter5.question3.Question3;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question3Test {
    @Test
    public void replaceWithX_whenAStringIsValid_shouldReturnAStringReplacedWIthX() {
        var strBuilder = new StringBuilder("1234");
        assertEquals("1234", Question3.replaceWithX(strBuilder));
    }
}
