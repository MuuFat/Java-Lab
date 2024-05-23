import java.util.Scanner;

public class Lab6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        System.out.print("Enter character to search : ");
        String searchChars = scanner.next();
        System.out.print("Enter replacement character: ");
        String replaceChars = scanner.next();
        String newStr = str.replace(searchChars, replaceChars);
        System.out.println("New string : " + newStr);
    }
}
