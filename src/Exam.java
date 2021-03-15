package src;

import java.util.ArrayList;

class ExamResults{

    private String examType;
    private Boolean result;

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }
}


public class Exam {

    private ArrayList<ExamResults> results = new ArrayList<ExamResults>();


    //Exam math
    private ArrayList<Question> getMathQuestions(){
        ArrayList<Question> mathQuestions = new ArrayList<Question>();

        //Questions Math
        mathQuestions.add(new Question("1 + 1 = ", "5" ));
        mathQuestions.add(new Question("9 + 10 =", "21" ));
        mathQuestions.add(new Question("6 + 132 =", "23" ));




        return mathQuestions;
    }





    public ArrayList<Question> getExam (String examType){

        switch (examType){
            case "math":
                return getMathQuestions();
            case "dutch":
                //HOI
                break;
        }

        return null;
    }


}
