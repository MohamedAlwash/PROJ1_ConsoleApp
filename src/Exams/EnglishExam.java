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
        englishQuestions.add(new Question("Hoe zeg 'zwijn' in het Engels?", "boar" ));
        englishQuestions.add(new Question("Hoe zeg je 'hallo' in het Engels?", "hello" ));
        englishQuestions.add(new Question("Hoe zeg 'kameel' in het Engels?", "camel" ));
        englishQuestions.add(new Question("Hoe noem je een 'snelweg' in het Engels?", "highway" ));
        englishQuestions.add(new Question("Geef een synoniem voor 'vicinity'", "environment" ));
        englishQuestions.add(new Question("Wat is 'mountain' in het Nederlands?", "berg" ));
        englishQuestions.add(new Question("Wat is 'redundant' in het Nederlands?", "overbodig" ));
        englishQuestions.add(new Question("Hoe zeg je 'persectief' in het Engels?", "perspective" ));
        englishQuestions.add(new Question("Hoe zeg je 'dromedaris' in het Engels?", "dromedary" ));






        return englishQuestions;
    }
}
