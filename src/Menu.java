package src;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {


    private final StudentHandler studentHandler;

    public Menu(StudentHandler studentHandler) {
        this.studentHandler = studentHandler;
    }

    public void menuInterface() {
        switch (menuOptions()) {
            case 1: // List of all exams
                for(ExamTypes exam : ExamTypes.values())
                {
                    System.out.println(exam);
                }
                break;
            case 2: // List of students

                studentHandler.displaysAllStudents();

                break;

            case 3: // Create new Student

                System.out.println("Vul uw naam in:");
                String studentName = Tools.SafeStringInput();

                System.out.println("Vul je studentnummer in:");
                Integer studentNumber = studentHandler.safeCreateStudentNumber();

                studentHandler.addStudent(studentName, studentNumber);

                System.out.println();
                System.out.println(studentName + " - " + studentNumber + " is toegevoegd.");

                break;

            case 4: //remove student

                Scanner sc = new Scanner(System.in);

                System.out.println("Welke student wilt u verwijderen?");

                studentHandler.displaysAllStudents();

                System.out.println("\nMaak een keuze:");
                studentHandler.removeStudent(sc.nextInt());

                break;

            case 5: //Attempt Exam

                System.out.println("Welke student ben je?");

                studentHandler.chooseStudent();

                int exams = 1;

                for(ExamTypes exam : ExamTypes.values())
                {

                    System.out.println(exams + ". " + exam);
                    exams++;
                }

                ExamTypes examPick = ExamTypes.Math;

                int choice = Tools.SafeIntegerInputWithInBounds(1, ExamTypes.values().length);
                if (choice == 1) {
                } else if (choice == 2) {
                    examPick = ExamTypes.English;
                }else if(choice == 3){
                    examPick = ExamTypes.Debug;
                }


                Exam exam = studentHandler.getUsingStudent().getExamResult().chooseExam(examPick);

                boolean passed = false;
                ArrayList<String> answers = new ArrayList<String>();
                for(Question examQuestions : exam.getExamQuestions()) {
                    System.out.println(examQuestions.getQuestion());

                    System.out.println("Geef antwoord:");
                    String answer = Tools.SafeStringInput();
                    answers.add(answer);

                }

                passed = studentHandler.getUsingStudent().getExamResult().checkAnswers(answers, exam);


                if (passed){
                    System.out.println("Gefeliciteerd, je hebt het gehaald");
                } else {
                    System.out.println("Helaas, je hebt het niet gehaald");
                }

                break;

            case 6: //Is student geslaagd voor een test?
                int index = 1;
                System.out.println("Welke student, kies een index");

                studentHandler.chooseStudent();

                System.out.println(studentHandler.getUsingStudent().getName());

                for(Exam examStudent : studentHandler.getUsingStudent().getExamResult().getExams())
                {
                    System.out.println(index++ + ". " + examStudent.getExamType());
                }

                System.out.println("Van welke examen wil je de resultaat hebben");

                int chooseNumber = Tools.SafeIntegerInputWithInBounds(1, studentHandler.getUsingStudent().getExamResult().getExams().size())-1;

                if(!studentHandler.getUsingStudent().getExamResult().getExams().get(chooseNumber).getResult())
                {
                    System.out.println("Onvoldoende");
                }else {
                    System.out.println("Voldoende");
                }

                break;

            case 7: //Welke examens heeft student gehaald?
                System.out.println("Welke student ben je?");
                studentHandler.chooseStudent();

                int i = 1;

                for (Exam passedExam: studentHandler.getUsingStudent().getExamResult().getAchievedExams()) {
                    System.out.println( (i) + ". " + passedExam.getExamType().toString());
                    i++;
                }

                break;

            case 8: //Welke student heeft de meeste examens gehaald?
                Student HighestStudent = null;
                ArrayList<Student> CopyStundents = new ArrayList<>(studentHandler.getAllStudents());

                int Lenght = CopyStundents.size();

                for (int l = 0; l < Lenght; l++){

                    int amount = -1;

                    for (Student allstudents: CopyStundents) {
                        int SizeOfAchievedExams = allstudents.getExamResult().getAchievedExams().size();
                        if(amount < SizeOfAchievedExams){
                            amount = SizeOfAchievedExams;
                            HighestStudent = allstudents;
                        }
                    }

                    CopyStundents.remove(HighestStudent);


                    System.out.println((l + 1) + ". " + HighestStudent.getName() + " Achieved: " + HighestStudent.getExamResult().getAchievedExams().size());


                }

                break;
            case 9:
                System.exit(1);
                break;

        }
        continueApplication();
    }

    private int menuOptions() {
        int select = 0;
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> menuOpties = new ArrayList<>();

        menuOpties.add("1. Lijst met examens");
        menuOpties.add("2. Lijst met studenten");
        menuOpties.add("3. Student toevoegen ");
        menuOpties.add("4. Student verwijderen");
        menuOpties.add("5. Examen afnemen");
        menuOpties.add("6. Is student geslaagd voor een test?");
        menuOpties.add("7. Welke examens heeft student gehaald?");
        menuOpties.add("8. Welke student heeft de meeste examens gehaald?");
        menuOpties.add("9. Exit");

        for (String option: menuOpties) {
            System.out.println(option);
        }

        System.out.println("\nMaak een keuze: ");

        select = Tools.SafeIntegerInputWithInBounds(1, menuOpties.size());
        System.out.println();
        Tools.DisplayMenuName(menuOpties.get(select - 1));

        return select;
    }

    private void continueApplication(){

        System.out.println("\nKeuze menu:");
        System.out.println("1. Terug naar Main menu");
        System.out.println("2. Exit");
        System.out.println("\nMaak een keuze: ");

        switch (Tools.SafeIntegerInputWithInBounds(1, 2)){
            case 1:
                Tools.DisplayMenuName("1. Terug naar Main menu");
                menuInterface();
            case 2:
                Tools.DisplayMenuName("2. Exit");
                System.exit(1);
        }
    }
}

