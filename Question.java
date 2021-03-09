public class Question {
    private String question;
    private String textAnswer;
    private Integer numberAnswer;


    public Question(String question,String textAnswer ) {
        this.question = question;
        this.textAnswer = textAnswer;
    }

    public Question (String question, Integer numberAnswer) {
        this.question = question;
        this.numberAnswer = numberAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getTextAnswer() {
        return textAnswer;
    }

    public Integer getNumberAnswer() {
        return numberAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setTextAnswer(String textAnswer) {
        this.textAnswer = textAnswer;
    }

    public void setNumberAnswer(Integer numberAnswer) {
        this.numberAnswer = numberAnswer;
    }
}
