package src;

import java.util.ArrayList;

class ExamResults{

    private String examType;
    private Boolean result;

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }
}

class Student {

    private String name;
    private static Integer studentNumber = 10000000;
//  private ArrayList<Exam> makes = new ArrayList<Exam>();
    public static final ArrayList<Student> ALL_STUDENTS = new ArrayList<>();
    private ArrayList<ExamResults> results = new ArrayList<ExamResults>();


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