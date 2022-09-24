import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vendos Peshën");
        float pesha = input.nextFloat();

        System.out.println("Vendos Gjatësinë");
        int gjatesia = input.nextInt();
        float bmi = (float) (pesha/Math.pow(gjatesia,2) *10000);

        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI është optimale" + bmi);
        } else {
            System.out.println("BMI nuk është optimale" + bmi);
        }
    }
}
