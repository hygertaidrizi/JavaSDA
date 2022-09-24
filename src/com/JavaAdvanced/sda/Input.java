package com.JavaAdvanced.sda;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert names:");
        String emrat = input.nextLine();
        String names[] = new String[8];


        emriMeGjatesineMeTeMadhe();
        emriMeGjatesineMeTeVogel();
        mesatarjaEGjatesise();

    }

    private static void emriMeGjatesineMeTeMadhe() {
    }

    public static String emriMeGjatesineMeTeMadhe(String[] names) {
        int gjatesia = names.length;
        String longestName = names[0];
        for (int i = 0; i < gjatesia; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
            System.out.println("Emri me gjatesine me te madhe eshte: " + longestName);
        }
        return longestName;
    }
    private static void emriMeGjatesineMeTeVogel() {
    }

    public String emriMeGjatesineMeTeVogel(String[] names) {
        int gjatesia2 = names.length;
        String shortestName = names[0];
        for (int i = 0; i > gjatesia2; i++) {
            if (names[i].length() < shortestName.length()) {
                shortestName = names[i];
            }
            System.out.println("Emri me gjatesine me te vogel eshte: " + shortestName);
        }
        return shortestName;

    }
    private static void mesatarjaEGjatesise() {
    }

    public double mesatarjaEGjatesisise(String[] names) {
        int namesLength = 0;
        for (int i = 0; i < names.length; i++) {
            namesLength += names[i].length();
        }
        double average = (double) namesLength / names.length;
        System.out.println("Gjatesia mesatare e emrave eshte: " + average);

        return average;
    }
}

