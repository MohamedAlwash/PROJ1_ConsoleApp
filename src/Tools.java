package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Tools {

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

        int input;

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

        boolean Valid = false;

        while (!Valid){
            try{
                input = scanner.next();
                Valid = StringInBounds(input, min, max);
            }catch (Exception exception){
                System.out.println("Input is niet geldig, probeer opnieuw");
            }
        }

        return input;
    }

    public static Integer SafeIntegerInputWithInBounds(Integer min, Integer max){
        Scanner scanner = new Scanner(System.in);

        int input = 0;

        boolean Valid = false;

        while (!Valid){
            try{
                String temp = scanner.next();
                input = Integer.parseInt(temp);
                Valid = IntegerInBounds(input, min, max);
            }catch (Exception exception){
                System.out.println("Input is niet geldig, probeer opnieuw");
            }
        }

        return input;
    }

    public static void DisplayMenuName(String text){
        System.out.println(text);
        System.out.println();
    }





}
