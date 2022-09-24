package com.JavaAdvanced.sda;
import java.util.Scanner;

// Ruaji te dhenat qe jepen nga perdoruesi dhe me pas beni keto kerkesa:
// Printo te dhenat e perdoruesit
// Gjej fjalen me te gjate tek arrayList
// Gjej fjalen me te shkurter tek arraylist
// Gjej fjalen/fjalet qe perseritet me shume se 1 here
// Ktheni fjalet ne poz tek me germa te medha
// Ktheni fjalet ne poz cift me germa te vogla.
public class UshtrimArrayList {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println ("Vendos emrin 1:");
        String emri1 = input.next();
        System.out.println ("Vendos emrin 2");
        String emri2 = input.next();
        System.out.println ("Vendos emrin 3");
        String emri3 = input.next();
        System.out.println ("Vendos emrin 4");
        String emri4 = input.next();
        String [] emrat = new String []{emri1, emri2, emri3, emri4};

        System.out.println ("Emri me i gjate eshte:" + " ");
        longestName();
        System.out.println ("Emri me i shkurter eshte:" + " ");
        shortestName();


    }


    private static void longestName() {
    }

    public static String longestName (String [] emrat){
        int size = emrat.length;
        String longestname = emrat [0];
        for (int i=0; i< size; i++){
            if (emrat[i].length()> longestname.length()){
                longestname = emrat[i];
            }
        }

        return longestname;
    }
    private static void shortestName() {
    }
    public static String shortestName (String [] emrat){
        int size = emrat.length;
        String shortestname = emrat[0];
        for (int i=0; i> size; i++){
            if (emrat[i].length()<shortestname.length()){
                shortestname = emrat[i];
            }
        }
        return shortestname;
    }

   // public static String frequency (String [] emrat){
       // int counter = 0;
       // for (int i=0; i< emrat.length; i++){
       // }
    //}
}
