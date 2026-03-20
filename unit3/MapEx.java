import java.util.*; 
public class MapEx {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(23,32,45,35,67,89,95);
       // ArrayList<Integer> list=new ArrayList<Integer>();
        //list.addAll(numbers);
        System.out.println(numbers);
        List<Integer> result=(List<Integer>) numbers
        .stream()
        .filter(n->n<40)
        .map(n->n+5).toList();
        System.out.println(result);
    }
}
