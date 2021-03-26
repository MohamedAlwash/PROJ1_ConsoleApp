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
                String studentNaam = scanner.nextLine();

                System.out.println("Vul je studentnummer in:");
                int studentNumber = scanner.nextInt();

                String convertedStudentNumber = String.valueOf(studentNumber);

                while (convertedStudentNumber.length() != 8) {
                    System.out.println("8 karakters vereist, probeer opnieuw");
                    studentNumber = scanner.nextInt();

                    convertedStudentNumber = String.valueOf(studentNumber);
                }

                for(Student studentNumbers : studentHandler.getAllStudents()) {

                    while(convertedStudentNumber.equals(studentNumbers.getStudentNumber())) {
                        System.out.println("Studentnummer bestaat al, vul andere in");

                        studentNumber = scanner.nextInt();
                        convertedStudentNumber = String.valueOf(studentNumber);

                    }
                        studentHandler.AddStudent(studentNaam, convertedStudentNumber);
                }

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
                int studentChoise = scanner.nextInt();

                studentHandler.setUsingStudent(studentHandler.getAllStudents().get(studentChoise - 1));

                System.out.println("1. Wiskunde examen");
                System.out.println("2. Engels examen");
                boolean examChoice = false;
                ExamTypes examPick = ExamTypes.Math;

                scanner.nextLine();
                while(!examChoice) {
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    if (choice == 1) {
                        examChoice = true;
                    } else if (choice == 2) {
                        examPick = ExamTypes.English;
                        examChoice = true;
                    } else {
                        System.out.println("Maak een keuze uit de opties");
                    }
                }


                Exam exam = studentHandler.getUsingStudent().getExamResult().chooseExam(examPick);

                boolean passed = false;
                ArrayList<String> answers = new ArrayList<String>();
                for(Question examQuestions : exam.getExamQuestions()) {
                    System.out.println(examQuestions.getQuestion());

                    System.out.println("Geef antwoord:");
                    String answer = scanner.nextLine();
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

                int chooseNumber = scanner.nextInt();

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
            selectie = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("YOU BITCH, THAT'S THE WRONG NUMBER.\n");
            menuInterface();
        }

        return selectie;
    }

}

