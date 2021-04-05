package src;

import java.util.ArrayList;
import java.util.Locale;

public abstract class Exam {

    private Boolean result;
    private ExamTypes examType;

    public Boolean getResult() {
        return result;
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