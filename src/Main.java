package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu result = new Menu(new StudentHandler());
        int exit = 0;

        Student.ALL_STUDENTS.add(new Student("Ashwin"));
        Student.ALL_STUDENTS.add(new Student("Mohamed"));
        Student.ALL_STUDENTS.add(new Student("Richall"));

        

        System.out.println(result.menuInterface());
        System.out.println("typ 1 om terug te gaan:");
        exit=sc.nextInt();
        while(exit == 1 ){
            System.out.println(result.menuInterface());
            System.out.println("typ 1 om terug te gaan:");
            exit=sc.nextInt();
        }
    }
}