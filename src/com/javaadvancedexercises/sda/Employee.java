package com.javaadvancedexercises.sda;

//Write a program by creating a class "Employee" that has the following methods and print the final salary
// 1- getInfo() which takes the salary, numbers of hours of work/day as parameters
//2- AddSal() which adss $10 to salary if the employee if it is less than $500
//3- AddWork() which adss $5 to salary if the number of hours of work/day is more than 6 hours
public class Employee {
    float rroga;
    float nrOreve;

    void getInfo (float rroga, float nrOreve){
        this.rroga = rroga;
        this.nrOreve = nrOreve;
    }
    float getInfo (){
        return this.rroga;
    }
    float getNrOreve (){
        return this.nrOreve;
    }

    void addSal (float rroga){
        if (rroga < 500){
            rroga+=10;
        }
    }
    void addWork (float nrOreve, float rroga){
        if (nrOreve > 6){
            rroga+=5;
        }
    }

    void printRroga (){
        System.out.println ("Rroga perfundimtare e punetorit eshte: " + rroga + "$");
    }
}
