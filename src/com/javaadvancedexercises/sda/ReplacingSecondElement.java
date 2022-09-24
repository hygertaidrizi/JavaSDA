package com.javaadvancedexercises.sda;

import java.util.ArrayList;
import java.util.List;

public class ReplacingSecondElement {
    public static void main (String []args){
        List<Integer> mosha = new ArrayList<Integer>();
        mosha.add(24);
        mosha.add(20);
        System.out.println ("Moshat :" + mosha);
        Integer mosha3 = 25;
        mosha.set(1, mosha3);
        int moshat = mosha.size();
        System.out.println ("Zevendeso moshen 20 me 25: ");
        for (int i=0; i<moshat; i++){
            System.out.println (mosha.get(i));
        }

    }
}
