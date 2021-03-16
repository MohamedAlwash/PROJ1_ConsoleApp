package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    String result = "";

    public String menuInterface() {

        Student student1 = new Student("Richall");
        Student student2 = new Student("Mohammed");


//        Student.ALL_STUDENTS.add(new Student("Ashwin"));
//        Student.ALL_STUDENTS.add(new Student("Mohamed"));
//        Student.ALL_STUDENTS.add(new Student("Richall"));

        int selectie = menuOpties();

// switch case voor menu opties
        switch (selectie) {
            case 1:
                result = "keuze 1";
                break;
            case 2:
                //print naam en de unieke hashcode van het object
                ArrayList<Student> allStudents = Student.ALL_STUDENTS;

                // print elk object uit de ALL_STUDENTS ArrayList met hashcode (studentnummer)
                for(int i = 0; i < allStudents.size(); i++) {
                     result = allStudents.get(i).getName() + " " + allStudents.get(i).hashCode();
                }

                break;
            case 3:
                result ="keuze 3";
                break;
            case 4:
                result ="keuze 4";
                break;
            case 5:
                result ="keuze 5";
                break;
            case 6:
                result ="keuze 6";
                break;
            case 7:
                result ="keuze 7";
                break;

        }
        return result;
    }


    public static int menuOpties(){
        int selectie;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> menuOpties = new ArrayList<>();
        menuOpties.add("1) Lijst met examens");
        menuOpties.add("2) Lijst met studenten");
        menuOpties.add("3) Nieuwe studenten ");
        menuOpties.add("4) Student verwijderen");
        menuOpties.add("5) Examen afnemen");
        menuOpties.add("6) Welke student heeft de meeste examens gehaald?");

        for(String opties :menuOpties){
            System.out.println(opties);
        }

        System.out.println("Maak een keuze");
        selectie = scanner.nextInt();
        return selectie;
    }

}

