package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public String result = "";

    public String menuInterface() {
        Scanner scanner = new Scanner(System.in);
        int selectie = menuOpties();

// switch case voor menu opties
        switch (selectie) {
            case 1:
                result = "keuze 1";
                break;
            case 2:
                //print naam en de unieke hashcode van het object
                ArrayList<Student> allStudents = Student.ALL_STUDENTS;

                StringBuilder sb = new StringBuilder();

                for (Student allStudent : allStudents) {
                    sb.append(allStudent.getName() + " " + allStudent.hashCode());
                    sb.append("\n");

                }
                return sb.toString();

            case 3:
                System.out.println("Vul uw naam in:");
                String studentName = scanner.nextLine();
                Student.ALL_STUDENTS.add(new Student(studentName));

                break;
            case 4:

                Scanner sc = new Scanner(System.in);

                System.out.println("Welke student wilt u verwijderen?");

                ArrayList<Student> studentList = Student.ALL_STUDENTS;
                int i = 0;
                for (Student allStudent : studentList) {
                    i++;
                    System.out.println((i + ". " + allStudent.getName() + " " + allStudent.hashCode()));
                }
                System.out.println("Kies index");
                int input = sc.nextInt();
                studentList.remove(input-1);

//                result = "keuze 4";
                break;
            case 5:
                result = "keuze 5";
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


    public static int menuOpties() {
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

