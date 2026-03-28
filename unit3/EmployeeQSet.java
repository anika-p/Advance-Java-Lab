import java.util.*;

class Employee {
    int id;
    String name;
    double salary;
    int age;
    String department;

    public Employee(int id, String name, double salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
}

public class EmployeeQSet {
    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
                new Employee(101, "Amit", 50000, 25, "IT"),
                new Employee(102, "Neha", 60000, 28, "HR"),
                new Employee(103, "Ravi", 45000, 24, "IT"),
                new Employee(104, "Karan", 70000, 30, "Finance"),
                new Employee(105, "Pooja", 55000, 27, "HR"),
                new Employee(106, "Rohit", 80000, 32, "IT"),
                new Employee(107, "Simran", 65000, 29, "Finance"),
                new Employee(108, "Amit", 50000, 25, "IT")
        ));

        //Q1
        
        empList.stream()
               .min((a,b)->(int)a.getSalary()-(int)b.getSalary())
               .ifPresent(e -> 
                   System.out.println("Min Salary Employee: " + e.getName() + " = " + e.getSalary())
               );

        //Q2
        empList.stream()
               .max(Comparator.comparingDouble(Employee::getSalary))
               .ifPresent(e ->
                   System.out.println("Max Salary Employee: " + e.getName() + " - " + e.getSalary())
               );

        //Q3
        empList.stream()
               .min(Comparator.comparingInt(Employee::getAge))
               .ifPresent(e ->
                   System.out.println("Youngest Employee: " + e.getName() + " - " + e.getAge())
               );

        //Q4
        empList.stream()
               .max(Comparator.comparingInt(Employee::getAge))
               .ifPresent(e ->
                   System.out.println("Oldest Employee: " + e.getName() + " - " + e.getAge())
               );
    }
}