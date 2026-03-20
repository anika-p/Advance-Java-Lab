
import java.util.ArrayList;
import java.util.List;

class Employee{
    int id;
    String name;
    String dept;
    Employee(int id,String name,String dept){
        this.id=id;
        this.name=name;
        this.dept=dept;

    }
}
public class MapQ7 {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"Anika","MCA");
        Employee e2=new Employee(2, "Rahul","MCA");
        Employee e3=new Employee(3, "Aditya","CSE");
        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        List<String> empNames=list
        .stream()
        .map(n->n.name)
        .toList();
        System.out.println(empNames);
        
    }
}
