package src.chapter10.questions;

import src.chapter10.questions.question3.Student;

public class Question4 {
    private final String studentId;
    private String name;
    private String address;
   double grade;

    public Question4(String studentId, String name, String address) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        var newStudent = new Student("123s", "Gabriela", "Street V");
        System.out.println(newStudent.toString());


    }
}
