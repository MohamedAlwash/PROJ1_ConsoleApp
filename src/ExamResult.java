package src;

import src.Exams.DebugExam;
import src.Exams.EnglishExam;
import src.Exams.MathExam;
import java.util.ArrayList;

public class ExamResult {

    public ArrayList<Exam> getAchievedExams() {
        return achievedExams;
    }

    private ArrayList<Exam> achievedExams = new ArrayList<>();
    private ArrayList<Exam> exams = new ArrayList<>();

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
            case Debug:
                DebugExam debugExam = new DebugExam();
                exams.add(debugExam);
                return debugExam;
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
