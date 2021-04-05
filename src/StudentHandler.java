package src;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentHandler {

    private Student usingStudent;
    private static ArrayList<Student> allStudents = new ArrayList<Student>();

    public ArrayList<Student> getAllStudents() {
        return allStudents;
    }

    public Student getUsingStudent() {
        return usingStudent;
    }

    public void setUsingStudent(Student usingStudent) {
        this.usingStudent = usingStudent;
    }

    public void addStudent(String studentName, Integer studentNumber){
        setUsingStudent(new Student(studentName, studentNumber));
        getAllStudents().add(getUsingStudent());
    }

    public void removeStudent(int studentIndex){
        getAllStudents().remove(studentIndex-1);

    }

    public void displaysAllStudents(){
        for (int i = 0; i < getAllStudents().size(); i++){
            System.out.println((i + 1) + ". " + getAllStudents().get(i).getName() + " - " + getAllStudents().get(i).getStudentNumber());
        }
    }

    public void chooseStudent(){

        displaysAllStudents();
        setUsingStudent(getAllStudents().get(Tools.SafeIntegerInputWithInBounds(1, getAllStudents().size()) - 1));

    }

    public Integer safeCreateStudentNumber(){

        Scanner scanner = new Scanner(System.in);

        Integer input = 0;

        boolean Valid = false;

        while (!Valid){
            try{
                input = Integer.parseInt(Tools.SafeStringInputWithInBounds(8, 8));
                if(input < 0){
                    throw new Exception();
                }
                Valid = checkIfStudentNumberExist(input);
            }catch (Exception exception){
                System.out.println("Input is niet geldig, probeer opnieuw");
            }
        }

        return input;

    }

    public boolean checkIfStudentNumberExist(Integer studentNumber){

        for (Student student: getAllStudents()) {
            if(studentNumber.equals(student.getStudentNumber())){
                System.out.println("Student nummer bestaat al, probeer een anderen.");
                return false;
            }
        }


        return true;
    }


}
