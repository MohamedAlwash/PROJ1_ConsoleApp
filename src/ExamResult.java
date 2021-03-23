package src;

import src.Exams.EnglishExam;
import src.Exams.MathExam;

import java.util.ArrayList;

public class ExamResult {


    public ArrayList<Exam> exams = new ArrayList<>();

    public ArrayList<Exam> getExams() {
        return exams;
    }

    public ArrayList<Question> ChooseExam(ExamTypes examType){
        switch (examType){
            case Math:
                MathExam mathExam = new MathExam();
                exams.add(mathExam);
                return mathExam.GetExamQuestions();
            case English:
                EnglishExam englishExam = new EnglishExam();
                exams.add(englishExam);
                return englishExam.GetExamQuestions();
        }
        return null;
    }

}
