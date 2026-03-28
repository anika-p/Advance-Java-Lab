import java.util.Arrays;
import java.util.List;

public class SortedQ8 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(8,26,13,41,19,32,5);
        System.out.println(list);
        List<Integer> sortedList=list.stream().filter(n->n>20).sorted((a,b)->a-b).toList();   //ascending
        
        System.out.println(sortedList);
    }
}
