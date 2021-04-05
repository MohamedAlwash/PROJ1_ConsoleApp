package src;

import src.Exams.EnglishExam;
import src.Exams.MathExam;
import java.util.ArrayList;

public class ExamResult {

    public ArrayList<Exam> achievedExams = new ArrayList<>();
    public ArrayList<Exam> exams = new ArrayList<>();

    public ArrayList<Exam> getExams() {
        return exams;
    }

    public Exam chooseExam(ExamTypes examType){
        switch (examType){
            case Math:
                MathExam mathExam = new MathExam();
                exams.add(mathExam);
                return mathExam;
            case English:
                EnglishExam englishExam = new EnglishExam();
                exams.add(englishExam);
                return englishExam;
        }
        return null;
    }

    public Boolean checkAnswers(ArrayList<String> answers, Exam exam){
        int correct = 0;
        ArrayList<Question> questions = exam.getExamQuestions();
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).getAnswer().equals(answers.get(i)) ) {
                correct++;
            }
        }
        if(correct >= questions.size() / 2) {
            exam.setResult(true);
            this.achievedExams.add(exam);
            return true;
        } else {
            exam.setResult(false);
            return false;
        }
    }
}
