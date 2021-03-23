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
        mathQuestions.add(new Question("1 + 1 =", "2" ));
        mathQuestions.add(new Question("9 + 10 =", "19" ));
        mathQuestions.add(new Question("50 + 60 =", "90" ));
        mathQuestions.add(new Question("7 x 9 =", "63" ));
        mathQuestions.add(new Question("100 / 25 =", "4" ));

        return mathQuestions;
    }
}
