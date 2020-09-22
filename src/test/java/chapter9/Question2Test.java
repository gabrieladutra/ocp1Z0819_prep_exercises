package chapter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static src.chapter9.question2.Question2.*;

public class Question2Test {
  @Test
  public void getArrayLength_whenArrayIsValid_shouldReturnArrayLength() {
    int[] first = new int[3];
    assertEquals(3, getArrayLength(first));
  }

  @Test
  public void getArrayLength_whenArrayLengthIsEmpty_shouldReturn0() {
    int[] second = {};
    assertEquals(0, getArrayLength(second));
  }

  @Test
  public void getArrayLength_whenArrayIsNull_shouldThrowAnException() {
    assertThrows(IllegalArgumentException.class, () -> getArrayLength(null));
  }
}
