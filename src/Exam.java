package src;

import java.util.ArrayList;

public abstract class Exam {

    private Boolean result;
    private ExamTypes examType;

    public Boolean getResult() {
        return result;
    }

    private Boolean checkAnswers(ArrayList<Question> questions, ArrayList<String> answers){
        Integer correct = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).getAnswer().equals(answers.get(i)) ) {
                correct++;
            }
        }
        if(correct >= questions.size() / 2) {
            return true;
        } else {
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