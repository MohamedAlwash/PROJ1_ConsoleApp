package src;

import java.util.ArrayList;

public class StudentHandler {

    private Student usingStudent;
    private static ArrayList<Student> allStudents = new ArrayList<Student>();

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

    public void AddStudent (String studentName, Integer studentNumber){

        setUsingStudent(new Student(studentName, studentNumber));
        getAllStudents().add(getUsingStudent());
    }

    public void RemoveStudent(int studentIndex){
        getAllStudents().remove(studentIndex-1);

    }

    public void DisplaysAllStudents(){
        for (int i = 0; i < getAllStudents().size(); i++){
            System.out.println((i + 1) + ". " + getAllStudents().get(i).getName() + " - " + getAllStudents().get(i).getStudentNumber());
        }
    }

    public void ChooseStudent(){

        DisplaysAllStudents();
        setUsingStudent(getAllStudents().get(Tools.SafeIntegerInputWithInBounds(1, getAllStudents().size()) - 1));

    }
}
