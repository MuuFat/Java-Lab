import java.util.Scanner;

public class Lab5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            double result = 0;
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    result = num1 / num2;
                }
            } else {
                System.out.println("Error: Invalid operator");
            }
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            }
            System.out.print("Do you want to continue? (y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                done = true;
            }
        }
        scanner.close();
    }
}