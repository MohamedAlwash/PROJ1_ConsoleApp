package src;

import java.util.ArrayList;

public class StudentHandler {

    private Student usingStudent;
    private ArrayList<Student> allStudents = Student.ALL_STUDENTS;

    public ArrayList<Student> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(ArrayList<Student> allStudents) {
        allStudents = allStudents;
    }

    public Student getUsingStudent() {
        return usingStudent;
    }

    public void setUsingStudent(Student usingStudent) {
        this.usingStudent = usingStudent;
    }

    public void AddStudent (String studentName, String studentNumber){

        setUsingStudent(new Student(studentName, studentNumber));
        getAllStudents().add(getUsingStudent());
    }

    public void RemoveStudent(int studentIndex){
        getAllStudents().remove(studentIndex-1);

    }
}
