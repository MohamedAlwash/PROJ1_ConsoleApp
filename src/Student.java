package src;

import java.util.ArrayList;

class Student {

    private ExamResult examResult;
    private String studentName;
<<<<<<< HEAD
    private String studentNumber;
    public static ArrayList<Student> ALL_STUDENTS = new ArrayList<>();
=======
>>>>>>> ac2adc666181ddbd992a9a59f805028b984b537f

    public Student(String studentName, String studentNumber) {
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

    public String getStudentNumber() {
        return studentNumber;
    }
}
