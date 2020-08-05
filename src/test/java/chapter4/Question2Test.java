package chapter4;

import org.junit.jupiter.api.Test;
import src.chapter4.question2.Bird;
import src.chapter4.question2.TestClass;

import static org.junit.jupiter.api.Assertions.*;

public class Question2Test {
    @Test
    public void bird_whenANameIsValid_shouldReturnInstanceName() {
        String name = "Woodpecker";
        int age = 2;
        Bird bird = new Bird(name, age, true);
        assertEquals(name, bird.getName());
    }

    @Test
    public void bird_whenAAgeIsValid_shouldReturnInstanceAge() {
        String name = "Woodpecker";
        int age = 2;
        Bird bird = new Bird(name, age, true);
        assertEquals(age, bird.getAge());
    }

    @Test
    public void bird_whenIsSinger_shouldReturnInstanceIsSinger() {
        Bird bird = new Bird("Woodpecker", 2, true);
        assertTrue(bird.isSinger());
    }

    public void bird_whdenIsSinger_shouldReturnInstanceIsSinger() {
        Bird bird = new Bird("Woodpecker", 2, true);
        assertEquals(bird, TestClass.bird);

    }


}
