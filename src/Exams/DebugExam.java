package src.Exams;

import src.Exam;
import src.ExamTypes;
import src.Question;

import java.util.ArrayList;

public class DebugExam extends Exam {

    public DebugExam() {
        setExamType(ExamTypes.Debug);
    }

    @Override
    public ArrayList<Question> getExamQuestions() {
        ArrayList<Question> debugQuestions = new ArrayList<Question>();

        debugQuestions.add(new Question("Is dit een test?", "ja"));
        debugQuestions.add(new Question("Is dit geen Test?", "nee"));

        return debugQuestions;
    }
}
