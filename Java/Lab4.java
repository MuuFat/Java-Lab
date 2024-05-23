import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        long num = sc.nextLong();
        int[] reversedDigits = reverse(num);
        System.out.print("The number in reverse: ");
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i] + " ");
        }
    }

    public static int[] reverse(long num) {
        if (num < 10) {
            int[] digits = { (int) num };
            return digits;
        } else {
            int digit = (int) (num % 10);
            int[] digits = reverse(num / 10);
            int[] reversedDigits = new int[digits.length + 1];
            for (int i = 0; i < digits.length; i++) {
                reversedDigits[i] = digits[i];
            }
            reversedDigits[digits.length] = digit;
            return reversedDigits;
        }
    }
}