package src;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

    //public String result = "";
    //private Student usingStudent;

    private StudentHandler studentHandler;

    public Menu(StudentHandler studentHandler) {
        this.studentHandler = studentHandler;
    }

    public void menuInterface() {
        Scanner scanner = new Scanner(System.in);
        //int selectie = menuOpties();

        // switch case voor menu opties
        switch (menuOptions()) {
            case 1: // List of all exams
                for(ExamTypes exam : ExamTypes.values())
                {
                    System.out.println(exam);
                }
                break;
            case 2: // List of students

                /*StringBuilder sb = new StringBuilder();

                for (Student allStudent : studentHandler.getAllStudents()) {
                    sb.append(allStudent.getName() + " " + allStudent.getStudentNumber() + "\n");
                    sb.append("\n");

                }*/

                studentHandler.DisplaysAllStudents();

                break;

            case 3: // Create new Student

                System.out.println("Vul uw naam in:");
                String studentName = Tools.SafeStringInput();

                System.out.println("Vul je studentnummer in:");
                Integer studentNumber = studentHandler.SafeCreateStudentNumber();

                studentHandler.AddStudent(studentName, studentNumber);

                System.out.println();
                System.out.println(studentName + " - " + studentNumber + " is toegevoegd.");

                break;

            case 4: //remove student

                Scanner sc = new Scanner(System.in);

                System.out.println("Welke student wilt u verwijderen?");

                studentHandler.DisplaysAllStudents();

                System.out.println("\nMaak een keuze:");
                studentHandler.RemoveStudent(sc.nextInt());

                break;

            case 5: //Attempt Exam

                System.out.println("Welke student ben je?");


                /*int studentChoice = Tools.SafeIntegerInputWithInBounds(0,studentHandler.getAllStudents().size());
                studentHandler.setUsingStudent(studentHandler.getAllStudents().get(studentChoice - 1));*/

                studentHandler.ChooseStudent();

                System.out.println("1. Wiskunde examen");
                System.out.println("2. Engels examen");

                ExamTypes examPick = ExamTypes.Math;

                int choice = Tools.SafeIntegerInputWithInBounds(1,2);
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
                    String answer = Tools.SafeStringInput();
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

                studentHandler.DisplaysAllStudents();

                int chooseNumber = Tools.SafeIntegerInput();

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

                /*int x = 0;
                for (Student student: studentHandler.getAllStudents()) {
                x++;
                System.out.println(x + ". " + student.getName());
                }
                int studentChoise = input.nextInt();

                studentHandler.setUsingStudent(studentHandler.getAllStudents().get(studentChoise - 1));*/

                System.out.println("Welke student ben je?");
                studentHandler.ChooseStudent();

                int i = 1;

                for (Exam passedExam: studentHandler.getUsingStudent().getExamResult().getExams()) {
                    if(passedExam.getResult()){
                        System.out.println( (i) + ". " + passedExam.getExamType().toString());
                        i++;
                    }
                }
                break;

            case 8:
                break;
            case 9:
                System.exit(1);
                break;

        }

        Continue();
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

    private void Continue(){

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

