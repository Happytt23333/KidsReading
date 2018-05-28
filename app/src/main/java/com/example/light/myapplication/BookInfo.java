package com.example.light.myapplication;

/**
 * Created by Light on 2018/4/24.
 */

public class BookInfo {
    public String bookname;
    public float difficulty;
    public float complexed1;
    public float complexed2;
    public Tag tag;
    public BookInfo(){}

    public void setBookname(String bookname){this.bookname = bookname;}
    public String getBookname(){return this.bookname;}

    public void setDifficulty(float difficulty){this.difficulty = difficulty;}
    public double getDifficulty(){return this.difficulty;}

    public void setComplexed1(float complexed1){this.complexed1 = complexed1;}
    public double getComplexed1(){return this.complexed1;}

    public void setComplexed2(float complexed2){this.complexed2 = complexed2;}
    public double getComplexed2(){return this.complexed2;}

}
class Tag{
    public String tag1;
    public String tag2;
    public String tag3;

    public Tag(){}

    public void setTag1(String tag){this.tag1 = tag;}
    public String getTag1(){return this.tag1;}

    public void setTag2(String tag){this.tag2 = tag;}
    public String getTag2(){return this.tag2;}

    public void setTag3(String tag){this.tag3 = tag;}
    public String getTag3(){return this.tag3;}
}
