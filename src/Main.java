package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu result = new Menu();
        result.menuInterface();
        Student.ALL_STUDENTS.add(new Student("Ashwin"));
        Student.ALL_STUDENTS.add(new Student("Mohamed"));
        Student.ALL_STUDENTS.add(new Student("Richall"));
        Student.ALL_STUDENTS.add(new Student("Test object"));

    }
}