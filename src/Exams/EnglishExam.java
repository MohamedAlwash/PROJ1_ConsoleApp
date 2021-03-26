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
        englishQuestions.add(new Question("Is it Ananas or Annenenas?", "pineapple" ));
        englishQuestions.add(new Question("Hoe zeg 'zwijn' in het engels?", "boar" ));
        englishQuestions.add(new Question("Hoe zeg je 'hallo' in het engels?", "hello" ));
        englishQuestions.add(new Question("Hoe zeg 'kameel' in het engels?", "camel" ));
        englishQuestions.add(new Question("Hoe noem je een 'snelweg' in het engels?", "highway" ));
        englishQuestions.add(new Question("Geef een synoniem voor 'vicinity'", "environment" ));
        englishQuestions.add(new Question("Geef een synoniem voor 'mountain'", "berg" ));
        englishQuestions.add(new Question("Geef een synoniem voor 'redundant'", "overbodig" ));
        englishQuestions.add(new Question("Hoe zeg je 'persectief' in het engels?", "perspective" ));
        englishQuestions.add(new Question("Hoe zeg je 'dromedaris' in het engels?", "dromedary" ));






        return englishQuestions;
    }
}
