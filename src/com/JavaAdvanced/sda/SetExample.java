package com.JavaAdvanced.sda;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendos emrin 1: ");
        String emri1 = input.nextLine();
        System.out.println("Vendos emrin 2 :");
        String emri2 = input.nextLine();
        System.out.println("Vendos emrin e 3 :");
        String emri3 = input.nextLine();
        Set<String> emrat = new HashSet<String>();
        emrat.add((emri1));
        emrat.add((emri2));
        emrat.add((emri3));
        System.out.println("Kontrollo nese emri i dhene ben pjese ne liste: ");
        String emri4 = input.nextLine();
        if (emrat.contains(emri4)) {
            System.out.println("Emri u gjet!");

        } else {
            System.out.println("Nuk u gjet!");
        }
    }
}
