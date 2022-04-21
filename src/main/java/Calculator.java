import java.util.Scanner;


public class Calculator {
    static Scanner scanner = new Scanner(System.in);


    public static void main (String[] args) {

        Calculate calculator = new Calculate();
        System.out.println("enter number:");
        double number1 = scanner.nextInt();
        System.out.print("+ - * /");

        var count = scanner.next(".").charAt(0);
        System.out.println("enter number:");
        double number2 = scanner.nextInt();


        switch (count) {
            case '*':
                System.out.println(number1 + " * " + number2 + " = " + calculator.multiply(number1, number2));
                break;
            case '/':
                System.out.println(number1 + " / " + number2 + " = " + calculator.divide(number1, number2));
                break;
            case '+':
                System.out.println(number1 + " + " + number2 + " = " + calculator.add(number1, number2));
                break;
            case '-':
                System.out.println(number1 + " - " + number2 + " = " + calculator.subtract(number1, number2));
                break;
            default:
        }
    }
}
