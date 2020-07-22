package chapter7.question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.chapter7.question1.Question1;

public class Question1Test {
    @Test
    public void isEven_whenANumberIsEven_shouldReturnTrue() {
        assertEquals(true, Question1.isEven(10));
    }

    @Test
    public void isEven_whenANumberIsNotEven_shouldReturnFalse() {
        assertEquals(false, Question1.isEven(11));
    }

    @Test
    public void isEvenTernary_whenNumberIsEven_shouldReturnTrue(){
        assertEquals(true, Question1.isEvenTernary(10));
    }
    @Test
    public void isEvenTernary_whenNumberIsNotEven_shouldReturnFalse(){
        assertEquals(false, Question1.isEvenTernary(11));
    }

}
