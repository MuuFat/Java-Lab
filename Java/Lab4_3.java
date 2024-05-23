import java.util.Scanner;

public class Lab4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of customer records: ");
        int numRecords = scanner.nextInt();

        int[][] customers = new int[numRecords][2];
        int[] remainingCustomers = new int[2];

        for (int i = 0; i < numRecords; i++) {
            System.out.print("Enter number of customers enter the shop: ");
            customers[i][0] = scanner.nextInt();

            System.out.print("Enter number of customers leave the shop: ");
            customers[i][1] = scanner.nextInt();
        }

        for (int[] customer : customers) {
            remainingCustomers[0] += customer[0];
            remainingCustomers[1] += customer[1];
        }

        System.out.println("Number of customers are in the shop: " + (remainingCustomers[0] - remainingCustomers[1]));
    }
}
