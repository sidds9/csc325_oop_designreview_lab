package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {

    //declaring variable
    private final int Credits;

    //Constructor
    public Freshman(String name, short age, double Gpa,  int Credits){
        super(name,age, Gpa);
        this.Credits = Credits;
    }

    //toString method
    @Override
    public String toString(){
        return super.toString() + ", Credits:" + Credits;
    }

}
