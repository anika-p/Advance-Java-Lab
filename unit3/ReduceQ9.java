import java.util.Arrays;
import java.util.List;

public class ReduceQ9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int max=list.stream().reduce(Integer.MIN_VALUE,(a,b)->Math.max(a, b));
        int smax=list.stream().reduce(Integer.MIN_VALUE, (a,b)->a>b&&a<max?a:b);
        System.out.println("Second max="+smax);


    }
}
