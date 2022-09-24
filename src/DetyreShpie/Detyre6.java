package DetyreShpie;

import java.util.Scanner;

public class Detyre6 {
    public static void main ( String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Vendosni vleren e temperatures per te zbuluar nese jeni me Covid-19");
        System.out.println("Personi 1");
        double vlera1 = input.nextDouble();
        if (vlera1 > 36.9) ;
        System.out.println("Personi 1 : Pozitiv me Covid-19");

        System.out.println ("Personi 2");
        double vlera2 = input.nextDouble ();
        if (vlera2 < 36.9);
        System.out.println ("Personi 2: Negativ");

    }
}

