package src;
import java.util.ArrayList;
import java.util.Scanner;

class Main
{
	public static void main(String[] args){

        Student student1 = new Student("Richall");
        Student student2 = new Student("Mohammed");


//        Student.ALL_STUDENTS.add(new Student("Ashwin"));
//        Student.ALL_STUDENTS.add(new Student("Mohamed"));
//        Student.ALL_STUDENTS.add(new Student("Richall"));

    int selectie = Menu();

// switch case voor menu opties
    switch (selectie){
        case 1:
            System.out.println("keuze 1");
            break;
        case 2:
            //print naam en de unieke hashcode van het object
            System.out.println(student1.getName()
                    + " " + student1.hashCode());
            System.out.println(student2.getName()
                    + " " + student2.hashCode());
            break;
        case 3:
            System.out.println("keuze 3");
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