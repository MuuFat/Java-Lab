import java.util.ArrayList;
import java.util.Scanner;

public class Lab14_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Train> trains = new ArrayList<>();

        int choice = 0;

        while (choice != 4) {
            System.out.println("Please choose an option:");
            System.out.println("1. Add a train");
            System.out.println("2. Update a train");
            System.out.println("3. Search for trains");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTrain(trains, scanner);
                    break;
                case 2:
                    updateTrain(trains, scanner);
                    break;
                case 3:
                    searchTrains(trains, scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using this program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    public static void addTrain(ArrayList<Train> trains, Scanner scanner) {
        System.out.println("Enter train number:");
        int number = scanner.nextInt();
        System.out.println("Enter destination of travel:");
        String destination = scanner.next();
        System.out.println("Enter time of arrival (HH:MM):");
        String time = scanner.next();

        Train train = new Train(number, destination, time);

        trains.add(train);

        System.out.println("The train has been added successfully.");
    }

    public static void updateTrain(ArrayList<Train> trains, Scanner scanner) {
        if (trains.isEmpty()) {
            System.out.println("There is no train to update.");
        } else {
            System.out.println("Enter train number to update:");
            int number = scanner.nextInt();

            int index = -1;

            for (int i = 0; i < trains.size(); i++) {
                Train train = trains.get(i);

                if (train.getNumber() == number) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("Train number is not found.");
            } else {
                System.out.println("Current information of train is:");
                System.out.println(trains.get(index));

                System.out.println("Enter new destination of travel:");
                String destination = scanner.next();
                System.out.println("Enter new time of arrival (HH:MM):");
                String time = scanner.next();

                trains.get(index).setDestination(destination);
                trains.get(index).setTime(time);

                System.out.println("Train has been updated successfully.");
            }
        }
    }

    public static void searchTrains(ArrayList<Train> trains, Scanner scanner) {
        if (trains.isEmpty()) {
            System.out.println("There are no trains to search.");
        } else {
            System.out.println("Enter the destination to search:");
            String destination = scanner.next();

            int count = 0;

            String earliest = "";

            for (Train train : trains) {
                if (train.getDestination().equalsIgnoreCase(destination)) {
                    count++;

                    if (earliest.isEmpty() || earliest.compareTo(train.getTime()) > 0) {
                        earliest = train.getTime();
                    }

                    System.out.println(train);
                }
            }

            if (count == 0) {
                System.out.println("There is no train with given destination.");
            } else {
                // Display the number of trains found and the earliest time of departure
                System.out.println("There are " + count + " trains with given destination.");
                System.out.println("The earliest time of departure " + earliest + ".");
            }
        }
    }
}

class Train {
    private int number;
    private String destination;
    private String time;

    public Train(int number, String destination, String time) {
        this.number = number;
        this.destination = destination;
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String toString() {
        return "Train number: " + number + ", Destination: " + destination + ", Time of arrival: " + time;
    }
}

