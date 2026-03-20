import java.util.Arrays;
import java.util.List;

public class MapQ1 {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("sachin","rahul","amit");
       // ArrayList<Integer> list=new ArrayList<Integer>();
        //list.addAll(numbers);
        System.out.println(list);
        List<String> result=(List<String>) list
        .stream()
        //.filter(n->n)
        .map(n->n.toUpperCase()).toList();
        System.out.println(result);
    }
}
