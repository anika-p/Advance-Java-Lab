import java.util.*;

class Student {
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class FilterQ16 {
    public static void main(String[] args) {

        // List<Student> students = Arrays.asList(
        //     new Student("Anika", 75),
        //     new Student("Rahul", 55),
        //     new Student("Priya", 82),
        //     new Student("Amit", 40)
        // );

        ArrayList<Student> list=new ArrayList<Student>();
        list.add(new Student("Student1", 50));
        list.add(new Student("Student2", 60));
        list.add(new Student("Student3", 65));
        list.add(new Student("Student4", 89));
        list.add(new Student("Student5", 95));
        list.add(new Student("Student6", 62));
        list.add(new Student("Student7", 58));


        // Filter students with marks > 60
        // students.stream()
        //         .filter(s -> s.marks > 60)
        //         .forEach(s -> System.out.println(s.name + " : " + s.marks));

        list.stream()
        .filter(s->s.marks>60)
        .forEach(s->System.out.println(s.name+" : "+s.marks));
    }
}