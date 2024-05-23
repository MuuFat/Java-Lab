import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab10 {
    private String name;
    private String surname;
    private int age;
    private int groupNumber;
    private String fieldOfStudy;
    private int id;

    public Lab10(String name, String surname, int age, int groupNumber, String fieldOfStudy, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public int getId() {
        return id;
    }

    public static void displayAll(List<Lab10> students) {
        for (Lab10 student : students) {
            System.out.println("Name: " + student.getName() + ", Surname: " + student.getSurname() + ", Age: " + student.getAge() + ", Group Number: " + student.getGroupNumber() + ", Field of Study: " + student.getFieldOfStudy() + ", ID: " + student.getId());
        }
    }

    public static void displayYoungerThan20(List<Lab10> students) {
        for (Lab10 student : students) {
            if (student.getAge() < 20) {
                System.out.println("Name: " + student.getName() + ", Surname: " + student.getSurname() + ", Age: " + student.getAge() + ", Group Number: " + student.getGroupNumber() + ", Field of Study: " + student.getFieldOfStudy() + ", ID: " + student.getId());
            }
        }
    }

    public static void displayAlphabetical(List<Lab10> students) {
        Collections.sort(students, Comparator.comparing(Lab10::getName));
        for (Lab10 student : students) {
            System.out.println("Name: " + student.getName() + ", Surname: " + student.getSurname() + ", Age: " + student.getAge() + ", Group Number: " + student.getGroupNumber() + ", Field of Study: " + student.getFieldOfStudy() + ", ID: " + student.getId());
        }
    }

    public static void main(String[] args) {
        List<Lab10> students = new ArrayList<>();
        students.add(new Lab10("Johnny", "Does", 32, 13, "Mathematics Science", 17231));
        students.add(new Lab10("Janey", "Dosey", 25, 22, "Computer Science", 87132));
        students.add(new Lab10("Alice", "Smithson", 19, 31, "Physics", 67993));
        students.add(new Lab10("Bobby", "Johnson", 24, 46, "Biology", 89764));
        students.add(new Lab10("Charlie", "Brownie", 22, 51, "Chemistry", 16745));
        students.add(new Lab10("David", "Lees", 19, 63, "Computer Science", 70746));
        students.add(new Lab10("Anthony", "Davis", 21, 79, "Mathematics", 16787));
        students.add(new Lab10("Devon", "Wilson", 18, 87, "Physic", 68458));
        students.add(new Lab10("Gracy", "Taylor", 21, 98, "Biology", 73589));
        students.add(new Lab10("Henry", "Clark", 17, 10, "Chemistry", 87610));

        System.out.println("Displaying students:");
        displayAll(students);

        System.out.println("\nDisplaying students younger than 20:");
        displayYoungerThan20(students);

        System.out.println("\nDisplaying students in alphabetical order:");
        displayAlphabetical(students);
    }
}
