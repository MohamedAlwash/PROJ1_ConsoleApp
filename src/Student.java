package src;

import java.util.ArrayList;

class Student {


    private ExamResult examResult;
    private String studentName;
    public static ArrayList<Student> ALL_STUDENTS = new ArrayList<>();

    public Student(String studentName) {
        this.studentName = studentName;
        this.examResult = new ExamResult();
        // ALL_STUDENTS.add(this);
    }

    public ExamResult getExamResult() {
        return examResult;
    }

    public String getName() {
        return this.studentName;
    }
}