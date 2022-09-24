package DetyreShpie;

import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Random numerRastsore = new Random();
        int numer = numerRastsore.nextInt(0,100);
        System.out.println("Numri random eshte :" + numer);

        do {
            System.out.println("Ju lutem vendosni nje numer : ");
            int numer1 = input.nextInt();
            if (numer1 > numer) {
                System.out.println("too much");

            } else if (numer1 < numer) {
                System.out.println("too little");

            } else if (numer1 == numer) {
                System.out.println("Congratulations");
                break;
            }

        }
        while (true);





    }

}







