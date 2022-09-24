package com.JavaAdvanced.sda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//max e listes
//nje numer eshte apo jo ne array list
//krijoni nje list me String dhe gjeni fjalen qe ka gjatesine me te madhe se 4 shkronja
public class ListExample {
    public static void main(String[] args) {
        List<Integer> age = new ArrayList<>();
        List <String> names = new ArrayList<>();
        age.add(2);
        age.add(211);
        age.add(22);
        age.add(3);
        names.add("Hygerta");
        names.add("Anne");
        names.add ("hi");
        names.add ("hey");
        System.out.println("Max eshte: " + maxList(age));
        System.out.println ("A ekziston 5 ne liste? " + age.contains(5));
        System.out.println ("A ekziston 22 ne liste? " + age.contains(22));
        System.out.println ("Emri qe ka me shume se 4 shkronja eshte: " + emratLength4(names));
    }

    public static Integer maxList(List<Integer> age) {
        int max = age.get(0);
        for (int i =1; i<age.size(); i++) {
            if (max < age.get(i)) {
                max = age.get(i);
            }
        }
        return max;
    }

    public static String emratLength4 (List<String> names){
        String longerthan4 = names.get(0);
        for (String element : names){
            if (element.length() > longerthan4.length()){
                longerthan4 = element;
            }
        }
        return emratLength4(names);
    }

}
