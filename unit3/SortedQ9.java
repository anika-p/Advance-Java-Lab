import java.util.Arrays;
import java.util.List;

public class SortedQ9 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(17,63,29,81,4,50);
        System.out.println(list);
        List<Integer> sortedList=list.stream().sorted((a,b)->b-a).toList();   //descending
        
        System.out.println(sortedList);
    }
}
