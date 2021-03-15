package src;

public class Question {
    private String question;
    private String answer;
    //private Boolean Correct;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
        //Correct = false;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

//    public Boolean getCorrect() {
//        return Correct;
//    }
//
//    public void setCorrect(Boolean correct) {
//        Correct = correct;
//    }
}
