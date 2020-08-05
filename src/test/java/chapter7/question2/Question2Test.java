package chapter7.question2;

import org.junit.jupiter.api.Test;
import src.chapter7.question2.OutOfRangeException;
import src.chapter7.question2.Question2;

import static org.junit.jupiter.api.Assertions.*;

public class Question2Test {
    @Test
    public void sumNumbersUpTo_whenNumberIsNegative_shouldThrowAException() {
        assertThrows(OutOfRangeException.class, () -> Question2.sumNumbersUpTo(-1));
    }

    @Test
    public void sumNumbersUpTo_whenNumberIsOutOfRange_shouldThrowAException() {
        assertThrows(OutOfRangeException.class, () -> Question2.sumNumbersUpTo(6));
    }

    @Test
    public void sumNumbersUpTo_whenNumberIsWithinRange_shouldReturnTheSum() {
        assertEquals(6, Question2.sumNumbersUpTo(3));
    }

}
