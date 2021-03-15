package src;

import java.util.ArrayList;

class Student {

    private String name;
    private static Integer studentNumber = 10000000;
//    private ArrayList<Exam> makes = new ArrayList<Exam>();
    public static final ArrayList<Student> ALL_STUDENTS = new ArrayList<>();




    public Student(String name) {
        this.name = name;
        ALL_STUDENTS.add(this);
    }

    private Integer createStudentNumber() {
        this.studentNumber = this.studentNumber;
        return studentNumber++;
    }

    public String getName() {
        return this.name;
    }

    public Integer getStudentNumber() {
        return this.studentNumber;
    }
}