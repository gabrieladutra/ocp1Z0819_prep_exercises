/*
 4.7 Exercise - Question 5
 */
package src;

public class Bird {
    Bird bird = new Bird(); // causes an infinite loop

    String name;
    int age;
    static float height;
    static double weight;
    static boolean isSinger;

    public void fly(){
        System.out.println(name + " " + age + " " + height + " " + weight + " " + isSinger);
    }

}