import java.util.Arrays;
import java.util.List;

public class ReduceSecLow {
     public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int low=list.stream().reduce(Integer.MAX_VALUE,(a,b)->Math.min(a, b));
        int slow=list.stream().reduce(0, (a,b)->a<b&&a>low?a:b);
        System.out.println("second low="+slow);


    }
}
