import java.util.List;
import java.util.Scanner;

public class Lab9_3 {
    public static <T extends Comparable<? super T>> T MaxElement(List<T> list, int begin, int end) {
        T max = list.get(begin);
        for (int i = begin + 1; i <= end; i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
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
        List<Integer> list = List.of(arr);

        System.out.print("Enter range [begin, end]: ");
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        Integer max = MaxElement(list, begin, end);
        System.out.printf("Max element in range [%d, %d]: %d%n", begin, end, max);
    }
}
