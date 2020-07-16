/*
 4.7 Exercise - Question 4
 */
package src;

public class TestClass {
    static Bird bird = new Bird();


    public static void main(String[] args) {
        Bird secondBird = new Bird();
        bird.fly();
        secondBird.fly();

    }
}