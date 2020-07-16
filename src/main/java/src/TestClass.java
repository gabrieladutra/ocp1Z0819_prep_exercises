/*
 4.7 Exercise - Question 2
 */
package src;

public class TestClass {
    static Bird bird = new Bird();

    public static void main(String[] args) {
        System.out.println(bird.age);
        System.out.println(bird.name);
        System.out.println(Bird.height);
        System.out.println(Bird.isSinger);
        System.out.println(Bird.weight);
        System.out.println(TestClass.bird);

    }
}