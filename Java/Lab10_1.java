import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Lab10_1 {
    private String surname;
    private String initials;
    private int numberOfBooks;

    public Lab10_1(String surname, String initials, int numberOfBooks) {
        this.surname = surname;
        this.initials = initials;
        this.numberOfBooks = numberOfBooks;
    }

    public String getSurname() {
        return surname;
    }

    public String getInitials() {
        return initials;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Lab10_1> users = new ArrayList<>();

        while (true) {
            System.out.println("Enter surname and initials separated by space:");
            String surname = scanner.next();
            String initials = scanner.next();
            System.out.println("Enter number of books on subscription:");
            int numberOfBooks = scanner.nextInt();
            users.add(new Lab10_1(surname, initials, numberOfBooks));
            System.out.println("Do you want to add another user? (y/n)");
            if (scanner.next().equals("n")) {
                break;
            }
        }

        System.out.println("Enter '1' to display reader who has the largest number of books or '2' to display list of library users in ascending order based on number of books:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Lab10_1 userWithMostBooks = Collections.max(users, Comparator.comparing(Lab10_1::getNumberOfBooks));
            System.out.println("Reader who has largest number of books is " + userWithMostBooks.getSurname() + " " + userWithMostBooks.getInitials() + " with " + userWithMostBooks.getNumberOfBooks() + " books.");
        } else if (choice == 2) {
            Collections.sort(users, Comparator.comparing(Lab10_1::getNumberOfBooks));
            System.out.println("List of library users in ascending order based on number of books:");
            for (Lab10_1 user : users) {
                System.out.println(user.getSurname() + " " + user.getInitials() + ": " + user.getNumberOfBooks() + " books");
            }
        } else {
            System.out.println("Invalid.");
        }
    }
}

