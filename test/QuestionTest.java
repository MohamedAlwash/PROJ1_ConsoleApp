package test;

import org.junit.Test;
import src.Question;

public class QuestionTest {


    private junit.framework.Assert Assert;

    @Test
    public void testGetAnswer() {
        Question a = new Question("a", "b");
        String expectedMessage = "b";

        Assert.assertEquals(expectedMessage, a.getAnswer());
    }

    @Test
    public void testGetQuestion() {
        Question a = new Question("a", "b");
        String expectedMessage = "a";

        Assert.assertEquals(expectedMessage, a.getQuestion());
    }

    @Test
    public void testSetQuestion() {
        Question a = new Question("a", "b");
        a.setQuestion("y");
        String expectedMessage = "y" ;

        Assert.assertEquals(expectedMessage, a.getQuestion());
    }

    @Test
    public void testSetAnswer() {
        Question a = new Question("a", "b");
        a.setAnswer("z");
        String expectedMessage = "z" ;

        Assert.assertEquals(expectedMessage, a.getAnswer());
    }

//    @Test
//    public void testSetNumberAnswer() {
//        Question a = new Question("2 + 2", 4);
//        a.setNumberAnswer(7);
//        Integer expectedMessage = 7 ;
//
//        Assert.assertEquals(expectedMessage, a.getNumberAnswer());
//
//    }

    //    @Test
//    public void testGetNumberAnswer() {
//        Question a = new Question("6 + 3", 9);
//        Integer expectedMessage = 9;
//
//        Assert.assertEquals(expectedMessage, a.getNumberAnswer());
//
//    }
}
