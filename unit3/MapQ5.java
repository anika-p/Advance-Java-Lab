import java.util.Arrays;
import java.util.List;

public class MapQ5 {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("A","B","C");
       // ArrayList<Integer> list=new ArrayList<Integer>();
        //list.addAll(numbers);
        System.out.println(list);
        List<String> result=(List<String>) list
        .stream()
        //.filter(n->n)
        .map(n->"Item="+n).toList();
        System.out.println(result);
    }
}
