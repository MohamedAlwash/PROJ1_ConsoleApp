package test;

import org.junit.Test;
import src.*;

import static org.junit.Assert.*;

public class StudentTest {

    //Het checkt of de gemaakte student, ook datwerkelijk de gemaakte student is.
    @Test
    public void testCreatingStudent(){
        StudentHandler studentHandler = new StudentHandler();

        studentHandler.addStudent("Test", 12345678);
        Student student = studentHandler.getUsingStudent();

        assertEquals("Test", student.getName());
        assertEquals(12345678, (int)student.getStudentNumber());
    }

    //Het checkt of er een student wordt toegevoegt en daarna weer verwijdert wordt.
    @Test
    public void testStudentList(){
        StudentHandler studentHandler = new StudentHandler();

        studentHandler.addStudent("Test", 12345678);

        assertEquals(1, studentHandler.getAllStudents().size());

        studentHandler.removeStudent(1);

        assertEquals(0, studentHandler.getAllStudents().size());
    }

    //Checkt of studentNummer al bestaat.
    @Test
    public void testCheckIfStudentNumberExit(){
        StudentHandler studentHandler = new StudentHandler();

        studentHandler.addStudent("Test", 12345678);

        boolean checked = studentHandler.checkIfStudentNumberExist(12345678);

        assertFalse(checked);
    }
}
