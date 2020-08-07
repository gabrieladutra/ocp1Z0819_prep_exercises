package chapter9;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static src.chapter9.question1.Question1.*;
public class Question1Test {
    @Test
    public void getBooleanArray_shouldReturnNewArrayOfBooleans(){
        boolean[] booleans = new boolean[3];
        assertArrayEquals(booleans, getBooleanArray(3));
    }
}
