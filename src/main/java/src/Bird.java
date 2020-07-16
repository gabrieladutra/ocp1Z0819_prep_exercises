/*
 4.7 Exercise - Question 6
 */
package src;

public class Bird {
    Bird bird;
    String name;
    int age;
    static float height;
    static double weight;
    static boolean isSinger;

    public void fly(){
        System.out.println(name + " " + age + " " + height + " " + weight + " " + isSinger);
    }

}