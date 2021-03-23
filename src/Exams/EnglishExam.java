package src.Exams;

import src.Exam;
import src.ExamTypes;
import src.Question;

import java.util.ArrayList;

public class EnglishExam extends Exam {

    public EnglishExam() {
        setExamType(ExamTypes.English);
    }

    @Override
    public ArrayList<Question> getExamQuestions() {
        ArrayList<Question> englishQuestions = new ArrayList<Question>();

        //Questions English
        englishQuestions.add(new Question("Is it Ananas or Annenenas?", "Pineapple" ));
        englishQuestions.add(new Question("Hoe zeg hond in het engels?", "Dog" ));
        englishQuestions.add(new Question("Hoe zeg je gedag in het engels?", "Hello" ));
        englishQuestions.add(new Question("Hoe zeg kat in het engels?", "Cat" ));
        englishQuestions.add(new Question("Hoe noem je een snelweg in het engels?", "Highway" ));

        return englishQuestions;
    }
}
