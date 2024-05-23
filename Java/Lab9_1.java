import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab9_1 {
    public static <T> int ElementWithProperty(List<T> list, Property<T> property) {
        int count = 0;
        for (T element : list) {
            if (property.hasProperty(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of integers: ");
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        System.out.printf("Enter %d integers:%n", n);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Property<Integer> isOdd = new Property<Integer>() {
            public boolean hasProperty(Integer element) {
                return element % 2 != 0;
            }
        };
        int count = ElementWithProperty(list, isOdd);
        System.out.println("Odd integers: " + count);

        Property<Integer> isPrime = new Property<Integer>() {
            public boolean hasProperty(Integer element) {
                if (element < 2) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(element); i++) {
                    if (element % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        };
        count = ElementWithProperty(list, isPrime);
        System.out.println("Prime numbers: " + count);

        Property<Integer> isPalindrome = new Property<Integer>() {
            public boolean hasProperty(Integer element) {
                String str = Integer.toString(element);
                return str.equals(new StringBuilder(str).reverse().toString());
            }
        };
        count = ElementWithProperty(list, isPalindrome);
        System.out.println("Palindromes: " + count);
    }
}

interface Property<T> {
    boolean hasProperty(T element);
}