package DetyreShpie;
//Write a Java program to compute the area of a polygon.
//Area of a polygon = (n*s^2)/(4*tan(π/n))
//where n is n-sided polygon and s is the length of a side
//Input Data:
import java.util.Scanner;
public class Polygon {
    public static void main(String[] args) {
        System.out.println("Vendos numrin e anesoreve te polygon:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Vendos gjatesine e anesores");
        double s = input.nextDouble();
        System.out.println("Madhesia e polygon eshte:" + madhesiaPoligon(n, s) + "\n");

    }

    private static double madhesiaPoligon(int n, double s) {
        return (n*(s*s) / (4.0* Math.tan(Math.PI/n)));
    }

}
