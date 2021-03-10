package src;

import java.util.ArrayList;

class Student {

    private String name;
    private Integer studentNumber = 10000000;
    private ArrayList<Exam> makes = new ArrayList<Exam>();
    public static final ArrayList<Student> ALL_STUDENTS = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        ALL_STUDENTS.add(this);
    }

    private Integer createStudentNumber() {
        Integer newStudentNumber = this.studentNumber++;
        return newStudentNumber;
    }

    public String getName() {
        return this.name;
    }

    public Integer getStudentNumber() {
        return this.studentNumber;
    }
}