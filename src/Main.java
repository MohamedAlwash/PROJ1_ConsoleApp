package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Main
{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student.ALL_STUDENTS.add(new Student("Ashwin"));
        Student.ALL_STUDENTS.add(new Student("Mohamed"));
        Student.ALL_STUDENTS.add(new Student("Richall"));
        Student.ALL_STUDENTS.add(new Student("Test object"));

        int selectie = Menu();

// switch case voor menu opties
    switch (selectie){
        case 1:
            System.out.println("keuze 1");
            break;
        case 2:
            ArrayList<Student> allStudents = Student.ALL_STUDENTS;

            // print elk object uit de ALL_STUDENTS ArrayList met hashcode (studentnummer)
            for(int i = 0; i < allStudents.size(); i++) {
                System.out.println(allStudents.get(i).getName() + " " + allStudents.get(i).hashCode());
            }

            break;
        case 3:

            System.out.println("Vul uw naam in:");
            String studentName = sc.nextLine();
            System.out.println(studentName);

            break;
        case 4:
            System.out.println("keuze 4");
            break;
        case 5:
            System.out.println("keuze 5");
            break;
        case 6:
            System.out.println("keuze 6");
            break;
        case 7:
            System.out.println("keuze 7");
            break;

    }
}

    public static int Menu(){
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