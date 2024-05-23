import java.util.Arrays;
import java.util.Scanner;

public class Lab14_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows and columns of array:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        Helper helper = new Helper();

        int[][] array = helper.initArray(rows, cols);

        System.out.println("Array is:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Enter value to search:");
        int value = scanner.nextInt();

        String result = helper.searchDiagonal(array, value);

        System.out.println(result);

        scanner.close();
    }
}

class Helper {

    public int[][] initArray(int rows, int cols) {
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = (int) (Math.random() * 10) + 1;
            }
        }

        return array;
    }

    public String searchDiagonal(int[][] array, int value) {
        String result = "";

        if (array.length == array[0].length) {
            for (int i = array.length - 1; i >= 0; i--) {
                int element = array[i][array.length - 1 - i];

                if (element == value) {
                    result += "(" + i + ", " + (array.length - 1 - i) + ") ";
                }
            }

            if (result.isEmpty()) {
                return "There is no such value in diagonal.";
            } else {
                return "Value is found at positions: " + result;
            }
        } else {
            return "Array is not square, so there is no diagonal.";
        }
    }
}
