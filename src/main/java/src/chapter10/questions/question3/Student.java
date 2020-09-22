package src.chapter10.questions.question3;

public class Student {
    // change access modifier(private -> public) to use in exercise 5
    public String studentId;
    public String name;
    public static String address;
    Student(){
        this(null, null, null);
    }
    public Student(String studentId, String name, String address) {
        this.studentId = studentId;
        this.name = name;
        Student.address = address;
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

        // cant access non static fields from static fields
        //      Question3.grade = 10.00;


    }
}
