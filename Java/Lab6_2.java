import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        System.out.print("Enter word search for: ");
        String word = scanner.next();
        int count = 0;
        String[] words = str.split("\\s+");
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Word '" + word + "' not found in string.");
        } else {
            System.out.println("Word '" + word + "' appears " + count + " times in string.");
        }
    }
}
