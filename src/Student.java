package src;

import java.util.ArrayList;

class Student {

    //Static variables
    public static final ArrayList<Student> ALL_STUDENTS = new ArrayList<>();
    private static Integer studentNumber = 10000000;

    //private variables
    private String studentName;
    private ArrayList<ExamResult> examResults = new ArrayList<ExamResult>();


    public Student(String studentName) {
        this.studentName = studentName;
        // ALL_STUDENTS.add(this);
    }

    public ArrayList<Question> GetNewExam(ExamTypes examTypes){
        examResults.add(new ExamResult(examTypes)); //Adds new ExamResult & set the type of exam the student is about to make
        return examResults.get(examResults.size()).getExam().getExamQuestions(examTypes); //Gets all the questions of the type exam the student is about to make
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