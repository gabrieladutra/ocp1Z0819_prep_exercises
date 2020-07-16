/*
 4.7 Exercise - Question 3
 */
package src;

public class TestClass {
    static Bird bird = new Bird();


    public static void main(String[] args) {
        Bird secondBird = new Bird();
        secondBird.name = "Woodpecker";
        secondBird.age = 2;

        bird.name = secondBird.name;
        bird.age = secondBird.age;

        System.out.println(bird.name);
        System.out.println(bird.age);
        System.out.println(secondBird.name);
        System.out.println(secondBird.age);

    }
}