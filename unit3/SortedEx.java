import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(23,12,1,45,23,76,26,91);
        System.out.println(list);
        //List<Integer> sortedList=list.stream().sorted((a,b)->a-b).toList();   //ascending
        //List<Integer> sortedList=list.stream().sorted((a,b)->b-a).toList();   //descending
        List<Integer> sortedList=list.stream().sorted(Comparator.reverseOrder()).toList();   

        System.out.println(sortedList);
    }
}
