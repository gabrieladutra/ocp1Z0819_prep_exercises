package src.chapter10.questions;

import src.chapter10.questions.question3.Student;

public class Question5 {
    public static Student method1(Student student) {
        var id = student.studentId = "234";
        var name = student.name = "Gabi";
        var address = student.address = "Street 2";

        return new Student(id,name,address);
    }

    public static void method2(Student student){
      var sameStudent =   method1(student);
        System.out.println(sameStudent.studentId  + " " + sameStudent.name + " " + sameStudent.address);
        sameStudent.studentId = "83732";
        sameStudent.name = "Gabriela";
        sameStudent.address = "Avenue 4";
        System.out.println(sameStudent.studentId + "" + sameStudent.name + " " + sameStudent.address);
    }

    public static void main(String[] args) {
        System.out.println(method1(new Student("214", "gabi", "234")));
       method2(new Student("214", "gabi", "234"));
    }
}
