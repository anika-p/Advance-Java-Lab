
import java.util.Arrays;
import java.util.List;

class Employee{
    int id;
    String name;
    int sal;
    String dept;

    public Employee(int id,String name,int sal,String dept) {
        this.id=id;
        this.name=name;
        this.sal=sal;
        this.dept=dept;
    }
    
}
public class SortedQ17 {

    public static void main(String[] args) {
        
    

    
    Employee e1=new Employee(1, "Rahul", 20000, "IT");
    Employee e2=new Employee(2 ,"Rohit", 50000, "CS");
    Employee e3=new Employee(3, "Anika", 40000, "MCA");
    List<Employee> list=Arrays.asList(e1,e2,e3);

    List<Employee> sortedList=list.stream().sorted((a,b)->a.sal-e2.sal).toList();

    sortedList.forEach(System.out::println);


    

} 
}
