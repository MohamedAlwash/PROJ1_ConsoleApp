package src;

import java.util.ArrayList;

public class Exam {


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
        englishQuestions.add(new Question("Is it Ananas or Annenenas?", "Pineapple" ));


        return englishQuestions;
    }



    public ArrayList<Question> getExamQuestions (ExamTypes examType){

        switch (examType){
            case Math:
                return getMathQuestions();
            case English:
                return  getEnglishQuestions();
        }

        return null;
    }


}
