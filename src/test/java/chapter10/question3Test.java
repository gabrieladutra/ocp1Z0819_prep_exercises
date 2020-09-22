package chapter10;

import org.junit.jupiter.api.*;
import src.chapter10.questions.question3.Student;

import static org.junit.jupiter.api.Assertions.*;


public class question3Test {

    @Test
    public void constructor_whenAStringIsValid_shouldCreateANewInstance(){
        var student = new Student("kdjf", "Gabriela", "Street VII");
        assertNotNull(student);
    }

}
