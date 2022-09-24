package DetyreShpie;
import java.util.Scanner;

public class Detyre7 {
    public static void main ( String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println ("Ju lutem vendosni noten e studentit");
        int nota = input.nextInt ();
        switch (nota) {
            case 10:
            case 9:
                System.out.println (" A");
                break;
            case 8:
            case 7:
                System.out.println (" B");
                break;
            case 6:
            case 5:
                System.out.println ( " C ");
                break;
            case 4:
                System.out.println ( " D");
                break;
            default :
                System.out.println (" Vendosni nje note tjeter");

        }
    }
}
