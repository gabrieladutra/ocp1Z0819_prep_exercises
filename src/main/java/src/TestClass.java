/*
 4.7 Exercise - Question 6
 */
package src;

public class TestClass {


    public static void main(String[] args) {
        Bird firstBird = new Bird();
        float literal = 10f;
        Float wrapper = 10f;
        double d = 11d;
        int i = 2;
        Integer i2 = 20;
        String s = "10f";

        firstBird.fly(literal);
        firstBird.fly(wrapper);
        firstBird.fly(d); // error
        firstBird.fly(i); // error
        firstBird.fly(i2); // error
        firstBird.fly(s); // error


    }

}