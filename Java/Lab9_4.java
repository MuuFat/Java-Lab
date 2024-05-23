import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab9_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            System.out.println("Select operation:");
            System.out.println("1. Add item");
            System.out.println("2. Delete item");
            System.out.println("3. Swap two elements");
            System.out.println("4. Show number of items");
            System.out.println("5. Show min and max items");
            System.out.println("6. Check if a particular element exists in list");
            System.out.println("7. Print all items");
            System.out.println("8. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter integer to add: ");
                    int item = scanner.nextInt();
                    list.add(item);
                    System.out.println("Item added successfully!");
                    break;
                case 2:
                    System.out.print("Enter index of item to delete: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < list.size()) {
                        list.remove(index);
                        System.out.println("Item deleted successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    System.out.print("Enter index of elements to swap: ");
                    int i = scanner.nextInt();
                    int j = scanner.nextInt();
                    if (i >= 0 && i < list.size() && j >= 0 && j < list.size()) {
                        Collections.swap(list, i, j);
                        System.out.println("Elements swapped successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 4:
                    System.out.println("Number of items: " + list.size());
                    break;
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("List empty!");
                    } else {
                        int min = Collections.min(list);
                        int max = Collections.max(list);
                        System.out.println("Min item: " + min);
                        System.out.println("Max item: " + max);
                    }
                    break;
                case 6:
                    System.out.print("Enter integer to search: ");
                    int searchItem = scanner.nextInt();
                    if (list.contains(searchItem)) {
                        System.out.println("Item found!");
                    } else {
                        System.out.println("Item not found!");
                    }
                    break;
                case 7:
                    System.out.println("Items in list:");
                    for (int itemInList : list) {
                        System.out.println(itemInList);
                    }
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

