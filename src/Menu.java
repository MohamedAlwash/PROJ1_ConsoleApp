package src;

import src.Exams.EnglishExam;
import src.Exams.MathExam;

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
            case 1:
                ExamTypes[] examTypes = ExamTypes.values();
                for(ExamTypes exam : examTypes)
                {
                    System.out.println(exam);
                }
                break;
            case 2: // List of students
                //print naam en de unieke hashcode van het object


                StringBuilder sb = new StringBuilder();

                for (Student allStudent : studentHandler.getAllStudents()) {
                    sb.append(allStudent.getName() + " " + allStudent.hashCode());
                    sb.append("\n");

                }
                return sb.toString();

            case 3: // Create new Student
                System.out.println("Vul uw naam in:");
                studentHandler.AddStudent(scanner.nextLine());
                break;
            case 4: //remove student

                Scanner sc = new Scanner(System.in);

                System.out.println("Welke student wilt u verwijderen?");

                int i = 0;
                for (Student allStudent : studentHandler.getAllStudents()) {
                    i++;
                    System.out.println((i + ". " + allStudent.getName() + " " + allStudent.hashCode()));
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

                studentHandler.setUsingStudent(studentHandler.getAllStudents().get(studentChoise));

                System.out.println("1. Wiskunde examen");
                System.out.println("2. Engels examen");
                boolean examChoice = false;
                ExamTypes examPick = ExamTypes.Math;
                int choise = 0;

                scanner.nextLine();
                while(!examChoice) {
                    choise = scanner.nextInt();
                    if (choise == 1) {
                        examChoice = true;
                    } else if (choise == 2) {
                        examPick = ExamTypes.English;
                        examChoice = true;
                    } else {
                        System.out.println("Maak een keuze uit de opties");
                    }
                }


                Exam exam = usingStudent.getExamResult().chooseExam(examPick);

                boolean passed = false;
                ArrayList<String> answers = new ArrayList<String>();
                for(Question examQuestions : exam.getExamQuestions()) {
                    System.out.println(examQuestions.getQuestion());

                    System.out.println("Geef antwoord:");
                    answers.add(scanner.nextLine());

                }
                passed = exam.checkAnswers(answers);


                if (passed){
                    System.out.println("Gefeliciteerd, je hebt het gehaald");
                } else {
                    System.out.println("Helaas, je hebt het niet gehaald");
                }
                // -> Menu with different exams (Math, English) with sout
                // -> Choose an exam
                // -> Get questions for the chosen exam
                // -> Display these question one by one with forloop
                // -> Check user input with the attached answer by the question
                // -> when true add 1 to variable CountofCorrect
                // -> After Exam check,if  CountofCorrect >= than Questions.size() /
                // 2. if true set in exam the boolean result to true, if false set in exam the boolean to false.
                // -> return to main menu

                break;
            case 6:
                result = "keuze 6";
                break;
            case 7:
                result = "keuze 7";
                break;
            case 8:
                result = "keuze 8";
                break;
//            case 0:
//                result = "keuze 0";
//                break;

        }
        return result;
    }


    private int menuOpties() {
        int selectie;
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
        selectie = scanner.nextInt();
        return selectie;
    }

}

