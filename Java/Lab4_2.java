import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of first side of triangle:");
        int a = sc.nextInt();
        System.out.println("Enter length of second side of triangle:");
        int b = sc.nextInt();
        System.out.println("Enter length of third side of triangle:");
        int c = sc.nextInt();
        boolean canBuildTriangle = (a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0);
        System.out.println("Triangle be built with the given sides? " + canBuildTriangle);
    }
}
