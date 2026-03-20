import java.util.Arrays;
import java.util.List;

public class MapQ2 {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1,2,3,4);
       // ArrayList<Integer> list=new ArrayList<Integer>();
        //list.addAll(numbers);
        System.out.println(numbers);
        List<Integer> result=(List<Integer>) numbers
        .stream()
        //.filter(n->n<40)
        .map(n->n*n).toList();
        System.out.println(result);
    }
}
