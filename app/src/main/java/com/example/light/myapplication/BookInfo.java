package com.example.light.myapplication;

/**
 * Created by Light on 2018/4/24.
 */

public class BookInfo {
    public String book_Imageurl;
    public String book_name;
    public String book_content;
    public String book_tag;

    public BookInfo(){}

    public void setBook_Imageurl(String url){this.book_Imageurl = url;}
    public String getBook_Imageurl(){return this.book_Imageurl;}

    public void setBook_name(String name){this.book_name = name;}
    public String getBook_name(){return this.book_name;}

    public void setBook_content(String content){this.book_content = content;}
    public String getBook_content(){return this.book_content;}

    public void setBook_tag(String tag){this.book_tag = tag;}
    public String getBook_tag(){return this.book_tag;}

}
