import java.util.Arrays;
import java.util.List;

public class ReduceQ4 {
    public static void main(String[] args) {
       List<Integer> list=Arrays.asList(12,45,7,89,23,56);
        int min=list.stream().reduce(Integer.MAX_VALUE,(a,b)->Math.min(a, b));
        System.out.println("Min="+min);


    }
}


