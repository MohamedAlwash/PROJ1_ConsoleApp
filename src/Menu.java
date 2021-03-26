package src;

import src.Exams.EnglishExam;
import src.Exams.MathExam;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public String result = "";
    private Student usingStudent;

    private StudentHandler studentHandler;

    public Menu(StudentHandler studentHandler) {
        this.studentHandler = studentHandler;
    }

    public String menuInterface() {
        Scanner scanner = new Scanner(System.in);
        int selectie = menuOpties();

// switch case voor menu opties
        switch (selectie) {
            case 1: // List of all exams
                ExamTypes[] examTypes = ExamTypes.values();
                for(ExamTypes exam : examTypes)
                {
                    System.out.println(exam);
                }
                break;
            case 2: // List of students


                StringBuilder sb = new StringBuilder();

                for (Student allStudent : studentHandler.getAllStudents()) {
                    sb.append(allStudent.getName() + " " + allStudent.getStudentNumber());
                    sb.append("\n");

                }
                return sb.toString();

            case 3: // Create new Student
                System.out.println("Vul uw naam in:");
                String studentNaam = Checker.SafeStringInput();

                System.out.println("Vul je studentnummer in:");

                Integer studentNumber = Checker.SafeCreateStudentNumber(studentHandler);

                studentHandler.AddStudent(studentNaam, studentNumber);
                break;
            case 4: //remove student

                Scanner sc = new Scanner(System.in);

                System.out.println("Welke student wilt u verwijderen?");

                int i = 0;
                for (Student allStudent : studentHandler.getAllStudents()) {
                    i++;
                    System.out.println((i + ". " + allStudent.getName() + " " + allStudent.getStudentNumber()));
                }
                System.out.println("Kies index");
                studentHandler.RemoveStudent(sc.nextInt());

//                result = "keuze 4";
                break;
            case 5:

                System.out.println("Welke student ben je?");



                int x = 0;
                for (Student student: studentHandler.getAllStudents()) {
                    x++;
                    System.out.println(x + ". " + student.getName());
                }

                int studentChoice = Checker.SafeIntegerInputWithInBounds(0,studentHandler.getAllStudents().size());
                studentHandler.setUsingStudent(studentHandler.getAllStudents().get(studentChoice -1 ));


                System.out.println("1. Wiskunde examen");
                System.out.println("2. Engels examen");
                ExamTypes examPick = ExamTypes.Math;

                int choice = Checker.SafeIntegerInputWithInBounds(1,2);
                if (choice == 1) {
                } else if (choice == 2) {
                    examPick = ExamTypes.English;
                }


                Exam exam = studentHandler.getUsingStudent().getExamResult().chooseExam(examPick);

                boolean passed = false;
                ArrayList<String> answers = new ArrayList<String>();
                for(Question examQuestions : exam.getExamQuestions()) {
                    System.out.println(examQuestions.getQuestion());

                    System.out.println("Geef antwoord:");
                    String answer = Checker.SafeStringInput();
                    answers.add(answer);

                }
                passed = exam.checkAnswers(answers);


                if (passed){
                    System.out.println("Gefeliciteerd, je hebt het gehaald");
                } else {
                    System.out.println("Helaas, je hebt het niet gehaald");
                }

                break;
            case 6: //Is student geslaagd voor een test?
                int index = 0;
                System.out.println("Welke student, kies een index");

                for(Student student : this.studentHandler.getAllStudents())
                {
                    index++;
                    System.out.println(index + ") " + student.getName());
                }

                int chooseNumber = Checker.SafeIntegerInput();

                ArrayList<Student> student =  this.studentHandler.getAllStudents();
                System.out.println(student.get(chooseNumber-1).getName());
                System.out.println(student.get(chooseNumber-1).getExamResult().getExams());
//                for(Exam examResultaat : student.get(chooseNumber-1).getExamResult().getExams())
//                {
//                    System.out.println(examResultaat.getResult());
//                }

                //Eerst selecteren welke examens en vervolgens de resultaat laten zien.
                break;
            case 7:
                result = "keuze 7";
                break;
            case 8:
                result = "keuze 8";
                break;

            default:
                System.out.println("Keuze bestaat niet, probeer opnieuw.\n");
                menuInterface();
                break;

        }
        return result;
    }


    private int menuOpties() {
        int selectie = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> menuOpties = new ArrayList<>();
        menuOpties.add("1) Lijst met examens");
        menuOpties.add("2) Lijst met studenten");
        menuOpties.add("3) Nieuwe studenten ");
        menuOpties.add("4) Student verwijderen");
        menuOpties.add("5) Examen afnemen");
        menuOpties.add("6) Is student geslaagd voor een test?");
        menuOpties.add("7) Welke examens heeft student gehaald?");
        menuOpties.add("8) Welke student heeft de meeste examens gehaald?");
        //menuOpties.add("0) Exit");

        for (String opties : menuOpties) {
            System.out.println(opties);
        }

        System.out.println("Maak een keuze");

        try{
            selectie = Checker.SafeIntegerInput();
        }
        catch (Exception e){
            System.out.println("YOU BITCH, THAT'S THE WRONG NUMBER.\n");
            menuInterface();
        }

        return selectie;
    }

}

