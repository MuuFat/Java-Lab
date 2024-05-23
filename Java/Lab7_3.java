import java.util.ArrayList;
import java.util.List;

public class Lab7_3 {
    private String name;
    private String surname;
    private int ID;
    private String fieldOfStudy;
    private int yearOfEnrollment;

    public void initializeFields(String name, String surname, int ID, String fieldOfStudy, int yearOfEnrollment) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.fieldOfStudy = fieldOfStudy;
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public int getYearOfStudy(int currentYear) {
        return currentYear - yearOfEnrollment + 1;
    }

    public void printStudentsByField(List<Lab7_3> students, String fieldOfStudy) {
        List<Lab7_3> studentsByField = new ArrayList<>();
        for (Lab7_3 student : students) {
            if (student.fieldOfStudy.equals(fieldOfStudy)) {
                studentsByField.add(student);
            }
        }
        System.out.println("Students in field of " + fieldOfStudy + ":");
        for (Lab7_3 student : studentsByField) {
            System.out.println(student.name + " " + student.surname);
        }
    }

    public static void main(String[] args) {
        Lab7_3 student1 = new Lab7_3();
        student1.initializeFields("John", "Frank", 12345, "Computer Science", 2020);

        Lab7_3 student2 = new Lab7_3();
        student2.initializeFields("Jane", "Frost", 67890, "Computer Science", 2021);

        List<Lab7_3> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        int currentYear = 2023;
        System.out.println("Year of enrollment: " + student1.yearOfEnrollment + " (year of study: " + student1.getYearOfStudy(currentYear) + ")");
        System.out.println("Year of study in 2021: " + student1.getYearOfStudy(2021));
        System.out.println("Year of study in 2022: " + student1.getYearOfStudy(2022));

        student1.printStudentsByField(students, "Computer Science");
    }
}
