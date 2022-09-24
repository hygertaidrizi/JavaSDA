package com.javaadvancedexercises.sda;

import java.util.Scanner;

//print the average of three numbers entered by user creating a class named "Average"
//having a method to calculate and print the average
public class Average {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println ("Vendos nr e pare: ");
        int a = input.nextInt();
        System.out.println ("Vendos nr e dyte: ");
        int b = input.nextInt();
        System.out.println ("Vendos nr e trete: ");
        int c = input.nextInt();
        System.out.println ("Mesatarja e ketyre numrave eshte: " + mesatarja(a, b,c) + "\n");
    }

    public static int mesatarja (int a, int b, int c){
        return (a + b + c)/ 3;
    }
}
