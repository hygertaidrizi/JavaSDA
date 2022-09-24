package com.javaadvancedexercises.sda;

import java.util.ArrayList;
import java.util.List;

public class PrintingUsingPosition {
    public static void main (String [] args){
        List <Integer> mosha = new ArrayList<Integer>();
        mosha.add(24);
        mosha.add(20);
        mosha.add(25);
        mosha.add(45);
        System.out.println ("Moshat: " + mosha);
        System.out.println ("Printo duke perdorur pozicionin e elementeve: ");
        int moshat = mosha.size();
        for (int i= 1; i<moshat; i++ ){
            System.out.println(mosha.get(i));
        }
    }
}
