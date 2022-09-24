package ClassExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LlogariaImpl {
    public static void main(String[] args) {

        // Test constructor and toString()
        Llogaria a1 = new Llogaria("A101", "Tan Ah Teck", 88);
        Llogaria a2 = new Llogaria("A102", "Kumar"); // default balance
        Llogaria a3 = new Llogaria("23", "Kot", 123);
        Llogaria a4 = new Llogaria("123", "kot1", 222);
        Llogaria a5 = new Llogaria("111", "kot3", 333);
        List<Llogaria> accounts = new ArrayList<>();
        accounts.add(a1);
        accounts.add(a2);
        accounts.add(a3);
        accounts.add(a4);
        accounts.add(a5);
        // Test Getters
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getEmri());
        System.out.println("Balance: " + a1.getBalanca());
        // Test credit() and debit()
        a1.credit(100);

        a1.debit(50);

        // a1.debit(500);  // debit() error

        // Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);

        findTheHighestBalance(accounts);
        findAtLeast500LekeInBalance(accounts);
        findTheLowestBalance(accounts);
        sortArray(accounts);
        printArray(accounts);
        nesetedFor();
        emriLlogariseTende(accounts);
    }

    public static void findTheHighestBalance(List<Llogaria> accounts) {
        int max = accounts.get(0).getBalanca();
        for (int i = 1; i < accounts.size(); i++) {
            if (max < accounts.get(i).getBalanca()) {
                max = accounts.get(i).getBalanca();
            }
        }

        System.out.println(max);
    }

    public static void findTheLowestBalance(List<Llogaria> accounts) {
        int min = accounts.get(0).getBalanca();
        for (int i = 1; i < accounts.size(); i++) {
            if (min > accounts.get(i).getBalanca()) {
                min = accounts.get(i).getBalanca();
            }
        }

        System.out.println(min);
    }

    public static void findAtLeast500LekeInBalance(List<Llogaria> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getBalanca() > 500) {
                System.out.println("Acounti me id " + accounts.get(i).getID() + " ka balancen me te madhe se 500");
            }
        }
    }

    public static void printArray(List<Llogaria> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }
    }

    public static void sortArray(List<Llogaria> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            for (int j = i + 1; j < accounts.size(); j++) {
                if (accounts.get(i).getBalanca() > accounts.get(j).getBalanca()) {
                    int temp = accounts.get(i).getBalanca();
                    accounts.get(i).setBalanca(accounts.get(j).getBalanca());
                    accounts.get(j).setBalanca(temp);
                }
            }
        }
    }


    public static void nesetedFor() {
        for (int i = 0; i < 7; i++) {
            System.out.println(i);
            for (int j = i + 1; j < 7; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    public static void emriLlogariseTende(List<Llogaria> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getEmri().startsWith("H")) {
                System.out.println("U Gjet!");
            } else {
                System.out.println("Nuk u gjet!");
            }
        }
    }
}