import java.util.Arrays;
import java.util.List;

public class SortedQ3 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(12,5,33,9,21,1);
        System.out.println(list);
        List<Integer> sortedList=list.stream().sorted((a,b)->b-a).limit(3).toList();   //descending
        
        System.out.println(sortedList);
    }
}
