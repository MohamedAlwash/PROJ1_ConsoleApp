package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentHandler studentHandler = new StudentHandler();

        //Menu result = new Menu(studentHandler);
        Menu menu = new Menu(studentHandler);
        int exit = 0;

        studentHandler.AddStudent("Ashwin", 12345678);
        studentHandler.AddStudent("Mohamed", 18046533);
        studentHandler.AddStudent("Richall", 2345791);


        menu.menuInterface();

        /*System.out.println(result.menuInterface());
        System.out.println("typ 1 om terug te gaan:");
        exit=sc.nextInt();
        while(exit == 1 ){
            System.out.println(result.menuInterface());
            System.out.println("typ 1 om terug te gaan:");
            exit=sc.nextInt();
        }*/
    }
}