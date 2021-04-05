package test;

import org.junit.Test;
import src.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class QuestionTest {



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




}
