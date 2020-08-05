
package src.chapter4.question2;

public class TestClass {
    public static Bird bird = new Bird("Woodpecker",2,true);

    public static void main(String[] args) {
        System.out.println(bird.getName());
        System.out.println(bird.getAge());
        System.out.println(bird.isSinger());
        System.out.println(Bird.height);
        System.out.println(Bird.weight);
        System.out.println(TestClass.bird);
    }
}


