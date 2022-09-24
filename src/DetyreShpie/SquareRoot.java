package DetyreShpie;
import java.util.Scanner;
public class SquareRoot {
    public static void main (String [] args){
        int n;
        System.out.print ("Insert any number:");
        Scanner input = new Scanner (System.in);
        int numri = input.nextInt();
        double square_root = Math.sqrt(numri);
        System.out.print ("Square root of " +numri+ " is " + square_root);
    }
}
