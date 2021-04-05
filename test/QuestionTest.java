package test;

import org.junit.Test;
import src.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class QuestionTest {

    //Het checkt of de gemaakte student, ook datwerkelijk de gemaakte student is.
    @Test
    public void testCreatingStudent(){
        StudentHandler studentHandler = new StudentHandler();

        studentHandler.AddStudent("Test", 12345678);
        Student student = studentHandler.getUsingStudent();

        assertEquals("Test", student.getName());
        assertEquals(12345678, (int)student.getStudentNumber());
    }

    //Het checkt of de questions die zijn gehardcode, ook datwerkelijk is wat wij hebben ingevuldt.
    @Test
    public void testGetQuestions(){
        StudentHandler studentHandler = new StudentHandler();

        studentHandler.AddStudent("Test", 12345678);
        Student student = studentHandler.getUsingStudent();

        ArrayList<Question> questions = student.getExamResult().chooseExam(ExamTypes.Debug).getExamQuestions();

        assertEquals("Is dit een test?", questions.get(0).getQuestion());
        assertEquals("ja", questions.get(0).getAnswer());
    }


    //Het checkt of er een student wordt toegevoegt en daarna weer verwijdert wordt.
    @Test
    public void testStudentList(){
        StudentHandler studentHandler = new StudentHandler();

        studentHandler.AddStudent("Test", 12345678);

        assertEquals(1, studentHandler.getAllStudents().size());

        studentHandler.RemoveStudent(1);

        assertEquals(0, studentHandler.getAllStudents().size());
    }

    //Het checkt of de exams worden toegevoegt aan de AchievedExams lijst, als ze goed zijn gemaakt.
    //En of de boolean die wordt terug gegeven klopt.
    @Test
    public void testAchievedExam(){
        StudentHandler studentHandler = new StudentHandler();

        studentHandler.AddStudent("Test", 12345678);
        Student student = studentHandler.getUsingStudent();

        Exam exam = student.getExamResult().chooseExam(ExamTypes.Debug);

        ArrayList<String> answer = new ArrayList<>();
        answer.add("ja");
        answer.add("nee");

        boolean gehaald = student.getExamResult().checkAnswers(answer, exam);

        assertTrue(gehaald);
        assertEquals(1 ,student.getExamResult().getAchievedExams().size());

        Exam exam2 = student.getExamResult().chooseExam(ExamTypes.Debug);

        ArrayList<String> answer2 = new ArrayList<>();
        answer2.add("nee");
        answer2.add("ja");

        boolean gehaald2 = student.getExamResult().checkAnswers(answer2, exam2);

        assertFalse(gehaald2);
        assertEquals(1 ,student.getExamResult().getAchievedExams().size());

    }

    @Test
    public void testToolsInBounds(){
        int test1 = 6;

        boolean IntegerInBounds = Tools.IntegerInBounds(test1,1, 4);

        assertFalse(IntegerInBounds);

        String test2 = "IkBenTim";

        boolean StringInBounds = Tools.StringInBounds(test2, 0, 10);

        assertTrue(StringInBounds);
    }

    @Test
    public void testCheckIfStudentNumberExit(){
        StudentHandler studentHandler = new StudentHandler();

        studentHandler.AddStudent("Test", 12345678);

        boolean checked = studentHandler.CheckIfStudentNumberExist(12345678);

        assertFalse(checked);
    }
}
