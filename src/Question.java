package src;

public class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
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


}

//    public void setNumberAnswer(Integer numberAnswer) {
//        this.numberAnswer = numberAnswer;
//    }


//    public Question(String question, Integer numberAnswer) {
//        this.question = question;
//        this.numberAnswer = numberAnswer;
//    }

//    public Integer getNumberAnswer() {
//        return numberAnswer;
//    }

//    public Question(String question, Integer numberAnswer) {
//        this.question = question;
//        this.numberAnswer = numberAnswer;
//    }