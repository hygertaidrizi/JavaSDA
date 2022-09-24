package DetyreShpie;
import java.util.Scanner;
//Write a Java program that accepts three integer values and return
// true if one of them is 20 or more and less than the substractions of others

public class Integer01 {
    public static void main (String [] args){
        System.out.println ("Vendos numrin e pare:");
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        System.out.println ("Vendos numrin e dyte:");
        int b = input.nextInt();
        System.out.println ("Vendos numrin e trete:");
        int c = input.nextInt();
        System.out.print ((Math.abs(a-b) >=20 || Math.abs(b-c)>=20 || Math.abs(c-a)>=20));

    }
}
