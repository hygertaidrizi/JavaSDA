package DetyreShpie;
import java.util.Scanner;
public class Matrix {
    public static void main (String [] args){
        int a[] = new int [5];
        int number,count=0;
        Scanner input = new Scanner (System.in);
        System.out.print ("Vendos elementet e array:");
        for (int i=0; i<a.length; i++){
            a[i] = input.nextInt();
        }
        System.out.print ("Elementet e array:");
        for (int i=0; i<a.length; i++){
            System.out.println (a[i] + " ");
        }
        System.out.println ("Enter the number you want to search:");
        number = input.nextInt();
        for (int i=0; i< a.length;i++){
            if (a[i] == number){
                count++;
            }
            if (count > 0) {
                System.out.println("Number is found " + count + " times");
            }
        }

    }

}
