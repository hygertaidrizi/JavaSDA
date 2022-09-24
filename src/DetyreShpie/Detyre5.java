package DetyreShpie;
import java.util.Scanner;

public class Detyre5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Zgjedh pergjigjen e sakte: 4 % 3");
        System.out.println("Alternativa A: 3");
        System.out.println("Alternativa B: 4");
        System.out.println("Alternativa C: 0");

        int pergjigja = input.nextInt();
        if (pergjigja == 3) {
            System.out.println("E sakte");
        } else if (pergjigja == 4) {
            System.out.println("E gabuar");
        } else if (pergjigja == 0) {
            System.out.println ("E gabuar");

        }
    }
}

