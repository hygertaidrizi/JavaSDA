import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendos vleren a:");
        int a = input.nextInt();
        System.out.println("Vendos vleren b:");
        int b = input.nextInt();
        System.out.println("Vendos vleren c:");
        int c = input.nextInt();
        double delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            System.out.println("Delta Negative");

        } else {
            double x = -b - Math.sqrt(delta) / 2 * a;
            System.out.println("Vlera e x eshte:" + x);
            double x2 = -b + Math.sqrt(delta) / 2 * a;
            System.out.println("Vlera e x eshte:" + x);
        }
    }
}