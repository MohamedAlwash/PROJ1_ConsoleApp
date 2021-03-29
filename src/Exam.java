package src;

import java.util.ArrayList;
import java.util.Locale;

public abstract class Exam {

    private Boolean result;
    private ExamTypes examType;
    private Integer correct = 0;

    public Boolean getResult() {
        return result;
    }
    public Boolean checkAnswers(ArrayList<String> answers){
        Integer correct = 0;
        ArrayList<Question> questions = getExamQuestions();
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).getAnswer().equals(answers.get(i)) ) {
                correct++;
            }
        }
        if(correct >= questions.size() / 2) {
            this.result = true;
            return true;
        } else {
            this.result = false;
            return false;
        }
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public ExamTypes getExamType() {
        return examType;
    }

    public void setExamType(ExamTypes examType) {
        this.examType = examType;
    }

    public abstract ArrayList<Question> getExamQuestions();

}