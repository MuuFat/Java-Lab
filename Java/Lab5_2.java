import java.util.Arrays;

public class Lab5_2 {
    public static void main(String[] args) {
        int[] oneDimensionalArray = {1, 2, 3, 4, 5};
        System.out.println("One dimension array: " + Arrays.toString(oneDimensionalArray));

        int[][] twoDimensionalArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Two dimension array:");
        for (int[] row : twoDimensionalArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}