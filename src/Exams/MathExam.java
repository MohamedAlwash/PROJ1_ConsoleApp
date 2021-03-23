package src.Exams;

import src.Exam;
import src.ExamTypes;
import src.Question;

import java.util.ArrayList;

public class MathExam extends Exam {

    public MathExam() {
        setExamType(ExamTypes.Math);
    }

    @Override
    public ArrayList<Question> getExamQuestions() {
        ArrayList<Question> mathQuestions = new ArrayList<Question>();

        //Questions Math
        mathQuestions.add(new Question("1 + 1 =", "5" ));
        mathQuestions.add(new Question("9 + 10 =", "21" ));
        mathQuestions.add(new Question("132 =", "23" ));


        return mathQuestions;
    }
}
