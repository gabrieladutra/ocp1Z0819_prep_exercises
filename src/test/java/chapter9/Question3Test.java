package chapter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static src.chapter9.Question3.*;

public class Question3Test {
  @Test
  public void getNextPositions_whenArrayIsNullShouldReturnAnException() {
    assertThrows(IllegalArgumentException.class, () -> getNextPositions(null));
  }

  @Test
  public void getNextPositions_whenArrayLengthIs0ShouldReturnAnException() {
    char[] array = new char[] {};
    assertThrows(IllegalArgumentException.class, () -> getNextPositions(array));
  }

  @Test
  public void getNextPositions_whenArrayIsValidShouldReturnAnNewArray() {
    char[] chars = new char[] {'z', 'x', 'a', 'l'};
    assertArrayEquals(new char[] {'x', 'a', 'l'}, getNextPositions(chars));
  }
}
