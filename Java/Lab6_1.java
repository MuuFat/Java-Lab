import java.util.Scanner;

public class Lab6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        System.out.print("Enter character to search : ");
        char ch = scanner.next().charAt(0);
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("The character '" + ch + "' not found in string.");
        } else {
            System.out.println("First occurrence of character '" + ch + "' is index " + index + ".");
        }
    }
}