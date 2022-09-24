package DetyreShpie;
import java.util.Scanner;

public class Integer02 {
    public static void main (String [] args){
        System.out.println ("Vendos numrin e pare:");
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        System.out.println ("Vendos numrin e dyte:");
        int b = input.nextInt();
        System.out.println ("Rezultati:" + rezultati(a,b));

    }

    private static int rezultati(int a, int b) {
        if (a == b) ;
        return 0;
    //    if(a % 6 == b % 6);
            //return (a<b ? a:b);
             // return (a>b ? a:b);
    }
}
