package src;

import java.util.ArrayList;

class Student {

    private ExamResult examResult;
    private String studentName;
    private String studentNumber;
    public static ArrayList<Student> ALL_STUDENTS = new ArrayList<>();

    public Student(String studentName, String studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.examResult = new ExamResult();
        // ALL_STUDENTS.add(this);
    }

    public ExamResult getExamResult() {
        return examResult;
    }

    public String getName() {
        return this.studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }
}
