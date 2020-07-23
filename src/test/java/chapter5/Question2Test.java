package chapter5;

import org.junit.jupiter.api.Test;
import src.chapter5.question2.Question2;

import static org.junit.jupiter.api.Assertions.*;

public class Question2Test {
    @Test
    public void concatWithX_whenAStringIsValid_shouldReturnAStringReplacedWIthX() {
        assertTrue(Question2.concatWithX("1234").contains("1234"));
    }

}
