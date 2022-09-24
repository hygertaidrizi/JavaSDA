package com.javaadvancedexercises.sda;

import java.util.Scanner;

//Krijo nje klase Circle me raidus si data member.
//krijo dy constructors (no argument, and two arguments)
//krijo nje metode qe llogarit Circumference
public class Circle {
    public static class CircleCircumference {
        double rreze;

        CircleCircumference (){}
        CircleCircumference (double rreze){
            this.rreze = rreze;
        }

    }

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println ("Vendos rrezen e rrethit: ");
        double rreze = input.nextDouble();
        double pi = 3.14;
        double circumference = 2*pi*rreze; //2 pi r
        System.out.println ("Circumference eshte e barabarte me: " + circumference);
    }

}
