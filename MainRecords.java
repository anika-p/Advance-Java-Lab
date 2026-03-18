import java.util.*;

record Student(int sid,String name,String course){};

public class MainRecords {
    public static void main(String[] args) {
        // Student s=new Student(1,"Student1","MCA");
        // System.out.println(s.sid());
        // System.out.println(s.name());
        // System.out.println(s.course());
        // System.out.println(s);
        int[] data=new int[]{1,2,3,4,5,6};
        List<Integer> listData=Arrays.stream(data).boxed().toList();
        
        listData.forEach((item)->System.out.println(item));
        listData.forEach(System.out::println);

    }
}
