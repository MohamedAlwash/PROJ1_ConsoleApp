package src;

import java.util.ArrayList;

/*public class Exam {


    //Exam math
    private ArrayList<Question> getMathQuestions(){
        ArrayList<Question> mathQuestions = new ArrayList<Question>();

        //Questions Math
        mathQuestions.add(new Question("1 + 1 = ", "5" ));
        mathQuestions.add(new Question("9 + 10 =", "21" ));
        mathQuestions.add(new Question("132 =", "23" ));


        return mathQuestions;
    }

    //Exam English
    private ArrayList<Question> getEnglishQuestions(){
        ArrayList<Question> englishQuestions = new ArrayList<Question>();

        //Questions English


        return englishQuestions;
    }



    public ArrayList<Question> getExamQuestions (ExamTypes examType){

        switch (examType){
            case Math:
                return getMathQuestions();
            case English:
                return getEnglishQuestions();
        }

        return null;
    }


}*/

public abstract class Exam{

    private String nameStudent;
    private Integer studentNumber;
    private Boolean result;
    private ExamTypes examType;

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Integer getStudentNumber() {
        return studentNumber;
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

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

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

    public abstract ArrayList<Question> GetExamQuestions();
}




