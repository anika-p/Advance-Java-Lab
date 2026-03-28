import java.util.Arrays;
import java.util.List;

public class SortedQ4 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(14,9,20,21,91,100,52,45);
        System.out.println(list);
        List<Integer> sortedList=list.stream().filter(n->n%2==0).sorted((a,b)->a-b).toList();   //ascending
        
        System.out.println(sortedList);
    }
}
