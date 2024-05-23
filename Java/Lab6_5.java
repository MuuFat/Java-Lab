import java.util.Scanner;

public class Lab6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        System.out.print("Enter letter to remove: ");
        String letter = scanner.next();
        String newStr = str.replaceAll(letter, "");
        System.out.println("New string : " + newStr);
    }
}
