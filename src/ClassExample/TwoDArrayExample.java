package ClassExample;
import java.util.Scanner;

public class TwoDArrayExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendos Gjeresine:");
        int gjatesia = input.nextInt();
        System.out.println ("Vendos Gjeresine");
        int gjeresia = input.nextInt();
        String vlera[][]= new String [gjatesia][gjeresia];

        for (int i = 0; i < vlera.length; i++) {
            System.out.println("Rreshti 1" + (i + 1) + ":");

            for (int j = 0; j<vlera[i].length; j++) {
                System.out.println("Kolona 1" + (j + 1) + ":");
                System.out.println("Jepni nje vlere");
                vlera[i][j] = input.next();
            }

        }

    }
}

