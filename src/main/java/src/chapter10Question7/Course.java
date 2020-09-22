package src.chapter10Question7;

import src.chapter10.questions.question3.Student;

public class Course {
    public static void enroll(){
        var s = new Student("1", "Ragnar","Kattegat");
        System.out.println(s.studentId + " " + s.name + " " +  Student.address);
    }

    public static void main(String[] args) {
        enroll();
    }
}
