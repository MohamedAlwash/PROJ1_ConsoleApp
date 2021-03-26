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

<<<<<<< HEAD
        Student.ALL_STUDENTS.add(new Student("Ashwin", "12345678"));
        Student.ALL_STUDENTS.add(new Student("Mohamed", "87654321"));
        Student.ALL_STUDENTS.add(new Student("Richall","10101010" ));
=======
        studentHandler.AddStudent("Ashwin");
        studentHandler.AddStudent("Mohamed");
        studentHandler.AddStudent("Richall");
>>>>>>> ac2adc666181ddbd992a9a59f805028b984b537f

        

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