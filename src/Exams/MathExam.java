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
        mathQuestions.add(new Question("(90 / 3) * 6 + 5 =", "23" ));
        mathQuestions.add(new Question("(6 / 2) * 5 + 5 =", "20" ));
        mathQuestions.add(new Question("(2 * 3) * 6 + 4 =", "40" ));
        mathQuestions.add(new Question("(90 / 3) * (6 + 5) =", "33" ));
        mathQuestions.add(new Question("(2 * 3) * (6 + 5) =", "66" ));

        return mathQuestions;
    }
}
