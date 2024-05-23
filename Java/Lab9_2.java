import java.util.Arrays;
import java.util.Scanner;

public class Lab9_2 {
    public static <T> void swapElements(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        System.out.printf("Enter %d elements:%n", n);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Before swapping: " + Arrays.toString(arr));
        System.out.print("Enter place of elements are swapping : ");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        swapElements(arr, i, j);
        System.out.println("After swapping: " + Arrays.toString(arr));
    }
}
