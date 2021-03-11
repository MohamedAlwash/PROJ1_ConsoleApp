package src;

import java.util.ArrayList;

public class Exam {

    //private String typeExam;
    private ArrayList<Boolean> results = new ArrayList<Boolean>();


    //Exam math
    private ArrayList<Question> getMathQuestions(){
        ArrayList<Question> mathQuestions = new ArrayList<Question>();

        //Questions Math
        mathQuestions.add(new Question("1 + 1 = ", "5" ));
        mathQuestions.add(new Question("9 + 10 =", "21" ));
        mathQuestions.add(new Question("6 + 132 =", "23" ));




        return mathQuestions;
    }





    public ArrayList<Question> getExam (Integer examType){

        switch (examType){
            case 0:
                return getMathQuestions();
            case 1:
                //HOI
                break;
        }

        return null;
    }

    //public String getTypeExam(){
    //   return typeExam;
    //}

}
