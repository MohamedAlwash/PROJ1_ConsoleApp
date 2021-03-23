package src;

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
                result = "keuze 1";
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

                System.out.println("1. Wiskunde examen");
                System.out.println("2. Engels examen");

                Integer keuze = scanner.nextInt();

                if(keuze == 1) {
                    ArrayList<Question> questions2 = studentHandler.getUsingStudent().getExamResult().chooseExam(ExamTypes.Math);
                    for(Question examQuestions : questions2) {
                        System.out.println(examQuestions.getQuestion());
                    }
                }
                else if(keuze == 2) {
                    ArrayList<Question> questions2 = studentHandler.getUsingStudent().getExamResult().chooseExam(ExamTypes.English);
                    for(Question examQuestions : questions2) {
                        System.out.println(examQuestions.getQuestion());

                        System.out.println("Geef antwoord:");
                        String gegevenAntwoord = scanner.nextLine();

                        int countCorrect = 0;
                        if(gegevenAntwoord.equals(examQuestions.getAnswer())) {
                            countCorrect++;
                        }
                        System.out.println(countCorrect);
                    }
                }
                // -> Menu with different exams (Math, English) with sout
                // -> Choose an exam
                // -> Get questions for the chosen exam
                // -> Display these question one by one with forloop
                // -> Check user input with the attached answer by the question
                // -> when true add 1 to variable CountofCorrect
                // -> After Exam check,if  CountofCorrect >= than Questions.size() / 2. if true set in exam the boolean result to true, if false set in exam the boolean to false.
                // -> return to main menu

                break;
            case 6:
                result = "keuze 6";
                break;
            case 7:
                result = "keuze 7";
                break;

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
        menuOpties.add("6) Welke student heeft de meeste examens gehaald?");

        for (String opties : menuOpties) {
            System.out.println(opties);
        }

        System.out.println("Maak een keuze");
        selectie = scanner.nextInt();
        return selectie;
    }

}

