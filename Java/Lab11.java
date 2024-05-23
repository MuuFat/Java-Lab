import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    private String name;
    private String nIN;

    public Person(String name, String nIN) {
        this.name = name;
        this.nIN = nIN;
    }

    public String getName() {
        return name;
    }

    public String getnIN() {
        return nIN;
    }
}

class Employee extends Person {
    private double Salary;
    private int startYear;

    public Employee(String name, String nIN, double annualSalary, int startYear) {
        super(name, nIN);
        this.Salary = annualSalary;
        this.startYear = startYear;
    }

    public double getAnnualSalary() {
        return Salary;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setAnnualSalary(double salary) {
        this.Salary = salary;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }
}

class Database {
    private ArrayList<Person> people;

    public Database() {
        people = new ArrayList<Person>();
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void addEmployee(Employee employee) {
        people.add(employee);
    }

    public void displayPeople() {
        Collections.sort(people, Comparator.comparing(Person::getName));
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public void displayEmployees() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for (Person person : people) {
            if (person instanceof Employee) {
                employees.add((Employee) person);
            }
        }
        Collections.sort(employees, Comparator.comparing(Person::getName));
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public String findEmployeeByNIN(String nIN) {
        for (Person person : people) {
            if (person instanceof Employee && person.getnIN().equals(nIN)) {
                return person.getName();
            }
        }
        return null;
    }

    public void RaiseEmployeesMoreThanFiveYears(int currentYear) {
        for (Person person : people) {
            if (person instanceof Employee) {
                Employee employee = (Employee) person;
                if (currentYear - employee.getStartYear() >= 5) {
                    employee.setAnnualSalary(employee.getAnnualSalary() * 1.1);
                    System.out.println("Employees Who Has Received a Raise: " + employee.getName());
                }
            }
        }
    }
}


    public class Lab11 {
        public static void main(String[] args) {
            Database database = new Database();

            Person person1 = new Person("Ayberk", "525-19-8484");
            Person person2 = new Person("Katie", "948-12-8395");
            Employee employee1 = new Employee("LeBron", "390-29-9837", 100000, 2017);
            Employee employee2 = new Employee("Jayson", "740-19-7359", 250000, 2020);

            database.addPerson(person1);
            database.addPerson(person2);
            database.addEmployee(employee1);
            database.addEmployee(employee2);

            for (Person person : database.getPeople()) {
                if (person instanceof Employee && person.getName().equals("LeBron")) {
                    Employee employee = (Employee) person;
                    employee.setStartYear(2017);
                }
            }

            for (Person person : database.getPeople()) {
                if (person instanceof Employee && person.getName().equals("Jayson")) {
                    Employee employee = (Employee) person;
                    employee.setStartYear(2020);
                }
            }

            System.out.println("People:");
            database.displayPeople();
            System.out.println();

            System.out.println("Employees:");
            database.displayEmployees();
            System.out.println();

            String nationalInsuranceNumber = "740-19-7359";
            String employeeName = database.findEmployeeByNIN(nationalInsuranceNumber);
            if (employeeName != null) {
                System.out.println("Employee with insurance number " + nationalInsuranceNumber + " / " + employeeName);
            } else {
                System.out.println("No employee with national insurance number " + nationalInsuranceNumber);
            }
            System.out.println();

            int currentYear = 2023;
            database.RaiseEmployeesMoreThanFiveYears(currentYear);
        }
    }
