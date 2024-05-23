import java.util.Scanner;

public class Lab7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();

        double sum = num1 + num2 + num3;
        double average = sum / 3;
        double product = num1 * num2 * num3;

        System.out.println("Sum of three numbers : " + sum);
        System.out.println("Average of three numbers : " + average);
        System.out.println("Product of three numbers : " + product);
    }
}