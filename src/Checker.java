package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Checker {

    // In bounds up to and including
    public static boolean IntegerInBounds(Integer input, Integer min, Integer max){

        if(input >= min && input <= max){
            return true;
        }

        System.out.println("Input is Out of Bounds, probeer opnieuw");
        return false;

    }

    // In bounds up to and including
    public static boolean StringInBounds(String input, Integer min, Integer max){
        if(input.length() >= min && input.length() <= max){
            return true;
        }

        System.out.println("Input is Out of Bounds, probeer opnieuw");
        return false;
    }


    public static String SafeStringInput(){
        Scanner scanner = new Scanner(System.in);

        String input;

        while (true){
            try{
                input = scanner.nextLine();
                return input;
            }catch (Exception exception){
                System.out.println("Input is niet geldig, probeer opnieuw");
            }
        }
    }

    public static Integer SafeIntegerInput(){
        Scanner scanner = new Scanner(System.in);

        Integer input;

        while (true){
            try{
                input = scanner.nextInt();
                return input;
            }catch (Exception exception){
                System.out.println("Input is niet geldig, probeer opnieuw");
            }
        }
    }

    public static String SafeStringInputWithInBounds(Integer min, Integer max){

        Scanner scanner = new Scanner(System.in);

        String input = null;

        boolean notValid = true;

        while (notValid){
            try{
                input = scanner.next();
                notValid = !StringInBounds(input, min, max);
            }catch (Exception exception){
                System.out.println("Input is niet geldig, probeer opnieuw");
                continue;
            }
        }

        return input;
    }

    public static Integer SafeIntegerInputWithInBounds(Integer min, Integer max){
        Scanner scanner = new Scanner(System.in);

        Integer input = 0;

        boolean Valid = false;

        while (!Valid){
            try{
                String temp = scanner.next();
                input = Integer.parseInt(temp);
                Valid = IntegerInBounds(input, min, max);
            }catch (Exception exception){
                System.out.println("Input is niet geldig, probeer opnieuw");
                continue;
            }
        }

        return input;
    }

    private static boolean CheckIfStudentNumberExist(Integer studentNumber, StudentHandler studentHandler){

        for (Student student: studentHandler.getAllStudents()) {
            if(studentNumber.equals(student.getStudentNumber())){
                System.out.println("Student nummer bestaat al, probeer een anderen.");
                return false;
            }
        }


        return true;
    }

    public static Integer SafeCreateStudentNumber(StudentHandler studentHandler){

        Scanner scanner = new Scanner(System.in);

        Integer input = 0;
        String temp = "";


        boolean Valid = false;

        while (!Valid){
            try{
                temp = scanner.next();
                Valid = StringInBounds(temp, 8, 8) && CheckIfStudentNumberExist(Integer.parseInt(temp), studentHandler);
            }catch (Exception exception){
                System.out.println("Input is niet geldig, probeer opnieuw");
                continue;
            }
        }


        return Integer.parseInt(temp);

    }





}
