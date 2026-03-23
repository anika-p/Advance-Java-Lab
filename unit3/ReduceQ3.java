import java.util.Arrays;
import java.util.List;

public class ReduceQ3 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(12,45,7,89,23,56);
        int max=list.stream().reduce(Integer.MIN_VALUE,(a,b)->Math.max(a, b));
        System.out.println("Max="+max);


    }
}
