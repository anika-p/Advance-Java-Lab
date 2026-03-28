import java.util.Arrays;
import java.util.List;

public class SortedQ6 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,5,10,7,5,3,8,3);
        System.out.println(list);
        List<Integer> sortedList=list.stream().distinct().sorted((a,b)->a-b).toList();   //ascending
        
        System.out.println(sortedList);
    }
}
