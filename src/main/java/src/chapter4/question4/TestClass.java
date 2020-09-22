package src.chapter4.question4;

public class TestClass {
    static Bird bird = new Bird();


    public static void main(String[] args) {
        Bird secondBird = new Bird();
        bird.fly();
        secondBird.fly();

    }
}
