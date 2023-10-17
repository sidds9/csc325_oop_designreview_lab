/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * @author Sheraz Siddiqi
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors
private double gpa;

// Constructor for Student
public Student(String name, short age, double gpa){
    super(name, age);
    this.gpa = gpa;
}

	// ToDo 3: Add a field for GPA and create a setter and a getter

    //Getters and Setters
    public double getGpa(){

    return gpa;
    }

    public void setGpa(double gpa){
    this.gpa = gpa;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {

    }

    //toString method
    @Override
    public String toString(){
    return  "Student " + " Name: " +getName() + ", Age: " + getAge() + ", GPA: " + getGpa();
    }


    // ToDo 4: Add comments to your code

}
