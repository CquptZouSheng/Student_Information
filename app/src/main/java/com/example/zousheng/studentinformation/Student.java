package com.example.zousheng.studentinformation;

/**
 * Created by Zou Sheng on 2015/12/8.
 */
public class Student {
    private String name;
    private String grade;
    private String qq;
    private String telephonenumber;
    public Student(String name,String grade,String qq,String telephonenumber){
        this.name=name;
        this.grade=grade;
        this.qq=qq;
        this.telephonenumber=telephonenumber;
    }
    public String getName(){
        return name;
    }
    public String getGrade(){
        return grade;
    }
    public String getQq(){
        return qq;
    }
    public String getTelephonenumber(){
        return telephonenumber;
    }
}
