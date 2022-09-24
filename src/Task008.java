import java.util.Scanner;
public class Task008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert number 1");
        float number1 = input.nextFloat();
        System.out.println("Choose an operator: +, -, *, or /");
        char operator = input.next().charAt(0);
        System.out.println("Insert number 2");
        float number2 = input.nextFloat();


        switch (operator) {
            case '+':
                float result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + "-" + number2 + "=" + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + "*" + number2 + "=" + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + result);
                break;

            default :
                System.out.println ("Invalid symbol");
                break;

        }

    }
}

