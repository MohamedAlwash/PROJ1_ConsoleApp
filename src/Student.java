package src;

import src.Exams.EnglishExam;
import src.Exams.MathExam;

import java.util.ArrayList;

class Student {

    //Static variables
    public static final ArrayList<Student> ALL_STUDENTS = new ArrayList<>();
    private static Integer studentNumber = 10000000;

    //private variables
    private String studentName;
    private ArrayList<Exam> exams = new ArrayList<>();


    public Student(String studentName) {
        this.studentName = studentName;
        // ALL_STUDENTS.add(this);
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }

    public ArrayList<Question> ChooseExam(ExamTypes examType){
        switch (examType){
            case Math:
                MathExam mathExam = new MathExam(studentName, studentNumber);
                exams.add(mathExam);
                return mathExam.GetExamQuestions();
            case English:
                EnglishExam englishExam = new EnglishExam(studentName, studentNumber);
                exams.add(englishExam);
                return englishExam.GetExamQuestions();
        }

        return null;
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