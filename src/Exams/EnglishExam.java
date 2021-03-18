package src.Exams;

import src.Exam;
import src.ExamTypes;
import src.Question;

import java.util.ArrayList;

public class EnglishExam extends Exam {

    public EnglishExam(String name, Integer number) {
        setExamType(ExamTypes.English);
        setNameStudent(name);
        setStudentNumber(number);
    }

    @Override
    public ArrayList<Question> GetExamQuestions() {
        ArrayList<Question> englishQuestions = new ArrayList<Question>();

        //Questions English
        englishQuestions.add(new Question("Is it Ananas or Annenenas?", "Pineapple" ));


        return englishQuestions;
    }
}
