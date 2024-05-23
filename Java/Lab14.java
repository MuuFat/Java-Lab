import java.util.Arrays;
import java.util.Scanner;

public class Lab14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = scanner.nextInt();

        int[] even = new int[size];
        int[] odd = new int[size];

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                even[evenCount] = number;
                evenCount++;
            } else {
                odd[oddCount] = number;
                oddCount++;
            }
        }

        scanner.close();

        System.out.println("The original even array is: " + Arrays.toString(even));
        System.out.println("The original odd array is: " + Arrays.toString(odd));

        Helper helper = new Helper();

        even = helper.reverseArray(even, evenCount);

        odd = helper.reverseArray(odd, oddCount);

        System.out.println("Reversed even array: " + Arrays.toString(even));
        System.out.println("Reversed odd array: " + Arrays.toString(odd));
    }
}

class Helper {

    public int[] reverseArray(int[] array, int count) {
        int[] reversed = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            reversed[count - 1 - i] = array[i];
        }

        return reversed;
    }
}

