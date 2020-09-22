package src;

public class Chapter10 {
    // Access level -- static or not - return type -- method name -- arguments
    public static String sayHi(final String name){
        return "Hi  " + name;
    }

    public static void main(String[] args) {
        System.out.println(Chapter10.sayHi("Gabriela"));

    }
}
