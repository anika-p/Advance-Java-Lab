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

        //Q9
        Set<String> seen = new HashSet<>();

        List<Employee> unique = empList.stream()
                              .filter(e -> seen.add(e.getName()))
                              .toList();

        Set<String> seen1 = new HashSet<>();

        empList.stream()
            .filter(e -> seen1.add(e.getName()))
            .forEach(e -> System.out.println(e.getName()));

        //Q13
        empList.stream()
       .filter(e -> e.getAge() > 25)
       .min(Comparator.comparingDouble(Employee::getSalary))
       .ifPresent(e -> System.out.println(e.getName() + " - " + e.getSalary()));


       //Q15
       empList.stream()
       .limit(5)
       .forEach(e -> System.out.println(e.getName()));

       //Q16
       empList.stream()
       .skip(3)
       .forEach(e -> System.out.println(e.getName()));

       //Q3
       List<Integer> list = Arrays.asList(25,10,5,30,15,20);

        int sum = list.stream()
                      .filter(x -> x % 2 == 0 && x > 10)
                      .map(x -> x * x)
                      .reduce(0, Integer::sum);

        System.out.println(sum);
        
        //Q4
        list.stream()
            .filter(x -> x % 2 == 0)
            .max(Integer::compare)
            .ifPresent(System.out::println);


        //Q5
        list.stream()
            .sorted(Comparator.reverseOrder()) // descending
            .skip(2)                           // remove top 2 largest
            .forEach(System.out::println);

        //Q6
        list.stream()
            .map(x -> x * 3)
            .min(Integer::compare)
            .ifPresent(System.out::println);

        //Q7
        int sum1 = list.stream()
                      .filter(x -> x >= 10 && x <= 40)
                      .reduce(0, Integer::sum);

        System.out.println(sum1);

        //Q8
        list.stream()
            .sorted(Comparator.reverseOrder())
            .skip(2)
            .findFirst()
            .ifPresent(System.out::println);

        //Q9
        list.stream()
            .map(x -> x * x)
            .sorted(Comparator.reverseOrder())
            .limit(4)
            .forEach(System.out::println);

        //Q10
        int sum2= list.stream()
                      .sorted()
                      .limit(4)
                      .reduce(0, Integer::sum);

        System.out.println(sum2);

        //Q11
        list.stream()
            .sorted()        // ascending
            .skip(3)         // skip 3 smallest
            .max(Integer::compare)
            .ifPresent(System.out::println);

        //Q12
        list.stream()
            .filter(x -> x % 2 != 0 && x > 20)
            .min(Integer::compare)
            .ifPresent(System.out::println);

        //Q13
        int product = list.stream()
                          .filter(x -> x > 5)
                          .reduce(1, (a, b) -> a * b);

        System.out.println(product);
    }
}