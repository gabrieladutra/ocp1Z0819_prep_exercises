package chapter5;

import org.junit.jupiter.api.Test;
import static  src.chapter5.question4.Question4.*;

import static org.junit.jupiter.api.Assertions.*;

public class Question4Test {
    @Test
    public void concatStringsOfArray_whenStringIsNotNull_shouldReturnConcatStrings() {
        String[] array = {"a", "b", "c", "d"};
        assertEquals("abcd", concatStringsOfArray(array));
    }

    @Test
    public void concatStringsOfArray_whenStringIsNull_shouldReturnConcatStrings() {
        String[] array = {"a", null, "c"};
        assertEquals("ac",concatStringsOfArray(array));
    }


    @Test
    public void concatStringsOfArray_whenArrayIsNull(){
        assertNull(concatStringsOfArray(null));
    }

    @Test
    public void concatStringsOfArray_whenArrayLengthIsEmpty_shouldThrowException(){
        String[] array = new String[0];
        assertThrows(IllegalArgumentException.class, () -> concatStringsOfArray(array));
    }

}
