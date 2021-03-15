package src;

import java.util.ArrayList;

public class Exam {

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
