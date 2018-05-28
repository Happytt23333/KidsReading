package com.example.light.myapplication;

import java.util.List;

/**
 * Created by Light on 2018/5/28.
 */

public class Questionnaire {
    public Title title;
    public List<Answer> answer;
    public Questionnaire(){}

    public void setAnswer(List<Answer> answer){
        this.answer = answer;
    }
    public List<Answer> getAnswer(){
        return this.answer;
    }

}

class Title{
    public String bookname;
    public String title1;
    public String title2;
    public String title3;
    public String title4;
    public String title5;

    public Title(){}
    public void setBookname(String bookname){this.bookname = bookname;}
    public String getBookname(){return this.bookname;}

    public void setTitle1(String title1){this.title1 = title1;}
    public String getTitle1(){return this.title1;}

    public void setTitle2(String title2){this.title2 = title2;}
    public String getTitle2(){return this.title2;}

    public void setTitle3(String title3){this.title3 = title3;}
    public String getTitle3(){return this.title3;}

    public void setTitle4(String title4){this.title4 = title4;}
    public String getTitle4(){return this.title4;}

    public void setTitle5(String title5){this.title5 = title5;}
    public String getTitle5(){return this.title5;}
}
class Answer{
    public String answerA;
    public String answerB;
    public String answerC;
    public Answer(){}

    public void setAnswerA(String answerA){
        this.answerA = answerA;
    }
    public String getAnswerA(){
        return this.answerA;
    }

    public void setAnswerB(String answerB){
        this.answerB = answerB;
    }
    public String getAnswerB(){
        return this.answerB;
    }

    public void setAnswerC(String answerC){
        this.answerC = answerC;
    }
    public String getAnswerC(){
        return this.answerC;
    }
}

