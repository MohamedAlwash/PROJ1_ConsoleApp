package src;

import src.Exams.EnglishExam;
import src.Exams.MathExam;

import java.util.ArrayList;

class Student {

    //Static variables
    public static final ArrayList<Student> ALL_STUDENTS = new ArrayList<>();
    private static Integer studentNumber = 10000000;

    private ExamResult examResult;

    //private variables
    private String studentName;


    public Student(String studentName) {
        this.studentName = studentName;
        this.examResult = new ExamResult();
        // ALL_STUDENTS.add(this);
    }

    private Integer createStudentNumber() {
        this.studentNumber = this.studentNumber;
        return studentNumber++;
    }

    public String getName() {
        return this.studentName;
    }

    public Integer getStudentNumber() {
        return this.studentNumber;
    }
}
