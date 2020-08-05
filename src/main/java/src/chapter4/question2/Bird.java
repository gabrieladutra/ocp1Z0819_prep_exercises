package src.chapter4.question2;

public class Bird {
    private final String name;
    private final int age;
    private final boolean isSinger;
    static float height;
    static double weight;

    public Bird( String name, int age, boolean isSinger){
        this.name = name;
        this.age = age;
        this.isSinger = isSinger;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSinger() {
        return isSinger;
    }

    public void fly() {

    }
}
