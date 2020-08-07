package chapter7;

import org.junit.jupiter.api.Test;
import src.chapter7.question3.NumberDivisibility;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Question3Test {

    @Test
    public void getTags_whenNumberIsDivisibleBy2_shouldReturnEven() {
        var n = 2;
        var newNumber = new NumberDivisibility(n);
        assertTrue(newNumber.getTags().contains("even"));
    }

    @Test
    public void getTags_whenNumberIsDivisibleBy3_shouldReturnThree() {
        var n = 3;
        var newNumber = new NumberDivisibility(n);
        assertTrue(newNumber.getTags().contains("three"));
    }

    @Test
    public void getTags_whenNumberIsDivisibleBy5_shouldReturnFive() {
        var n = 5;
        var newNumber = new NumberDivisibility(n);
        assertTrue(newNumber.getTags().contains("five"));
    }

    @Test
    public void getTags_whenNumberIsDivisibleBy2and3_shouldReturn23() {
        var n = 6;
        var newNumber = new NumberDivisibility(n);
        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("even");
        stringArray.add("23");
        assertEquals(stringArray, newNumber.getTags());
    }

    @Test
    public void getTags_whenNumberIsDivisibleBy23and5_shouldReturn235() {
        var n = 180;
        var newNumber = new NumberDivisibility(n);
        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("even");
        stringArray.add("23");
        stringArray.add("235");
        assertEquals(stringArray, newNumber.getTags());
    }

    @Test
    public void getTags_whenNumberIsNotDivisibleBy23and5_shouldReturnUnknown() {
        var n = 7;
        var newNumber = new NumberDivisibility(n);
        assertTrue(newNumber.getTags().contains("unknown"));
    }

}
