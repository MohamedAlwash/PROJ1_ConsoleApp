package src;

import java.util.ArrayList;

class Student {

    private ExamResult examResult;
    private String studentName;
    private Integer studentNumber;
    public static ArrayList<Student> ALL_STUDENTS = new ArrayList<>();

    public Student(String studentName, Integer studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.examResult = new ExamResult();
    }

    public ExamResult getExamResult() {
        return examResult;
    }

    public String getName() {
        return this.studentName;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }
}
