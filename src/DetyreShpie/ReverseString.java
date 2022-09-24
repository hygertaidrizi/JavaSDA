package DetyreShpie;
import java.util.Scanner;

public class ReverseString {
    public static void main (String [] args){
        System.out.println ("Insert e sentence:");
        Scanner input = new Scanner (System.in);
        char [] fjalia  = input.nextLine().toCharArray();
        System.out.println ("Reversed sentence:");
        for (int i = fjalia.length -1; i>=0; i--){
            System.out.print (fjalia [i]);
        }



    }
}
