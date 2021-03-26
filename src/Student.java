package src;

import java.util.ArrayList;

class Student {


    private ExamResult examResult;
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
        this.examResult = new ExamResult();
    }

    public ExamResult getExamResult() {
        return examResult;
    }

    public String getName() {
        return this.studentName;
    }
}