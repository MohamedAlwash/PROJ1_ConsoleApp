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

        Menu result = new Menu(studentHandler);
        int exit = 0;

        studentHandler.AddStudent("Ashwin");
        studentHandler.AddStudent("Mohamed");
        studentHandler.AddStudent("Richall");

        

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