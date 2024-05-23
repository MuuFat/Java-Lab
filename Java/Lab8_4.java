class Subjects {
    String fieldOfStudy;

    Subjects(String fieldOfStudy) {
        if (fieldOfStudy == null || fieldOfStudy.isEmpty()) {
            this.fieldOfStudy = "Unknown";
        } else {
            this.fieldOfStudy = fieldOfStudy;
        }
    }

    void printSubjects() {
        switch (fieldOfStudy) {
            case "Mathematics":
                System.out.println("Subjects for Mathematics:");
                System.out.println("- Algebra");
                System.out.println("- Calculus");
                System.out.println("- Geometry");
                System.out.println("- Statistics");
                System.out.println("- Discrete Mathematics");
                break;
            case "Computer Science":
                System.out.println("Subjects for Computer Science:");
                System.out.println("- Programming");
                System.out.println("- Data Structures");
                System.out.println("- Algorithms");
                System.out.println("- Databases");
                System.out.println("- Artificial Intelligence");
                break;
            case "Philology":
                System.out.println("Subjects for Philology:");
                System.out.println("- Linguistics");
                System.out.println("- Literature");
                System.out.println("- Rhetoric");
                System.out.println("- Translation");
                System.out.println("- Cultural Studies");
                break;
            case "Physics":
                System.out.println("Subjects for Physics:");
                System.out.println("- Mechanics");
                System.out.println("- Thermodynamics");
                System.out.println("- Electromagnetism");
                System.out.println("- Optics");
                System.out.println("- Quantum Physics");
                break;
            default:
                System.out.println("Unknown.");
        }
    }
}
public class Lab8_4 {
    public static void main(String[] args) {
        Subjects[] subjects = {
                new Subjects("Mathematics"),
                new Subjects("Computer Science"),
                new Subjects("Philology"),
                new Subjects("Physics"),
                new Subjects(""),
                new Subjects("Philosophy")
        };
        for (Subjects subject : subjects) {
            subject.printSubjects();
            System.out.println();
        }
    }
}

