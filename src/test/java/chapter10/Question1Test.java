package chapter10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static src.chapter10.questions.Question1.*;


public class Question1Test {
    @Test
    public void add_whenNumbersIsGreaterThan0_shouldReturnSumOfNumbers(){
        assertEquals(6, add(1,2,3));
    }
    @Test
    public void add_whenNumbersIsEqual0_shouldThrowAException(){assertThrows(IllegalArgumentException.class , () -> add());}
}
