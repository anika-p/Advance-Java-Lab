import java.util.Arrays;
import java.util.List;

public class SortedQ7 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(55,12,88,34,99,21);
        System.out.println(list);
        int second=list.stream().sorted((a,b)->b-a).toList().get(1);   //descending
        
        System.out.println(second);
    }
}
