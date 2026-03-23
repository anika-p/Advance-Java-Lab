import java.util.Arrays;
import java.util.List;

public class ReduceQ5 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(34,12,45,76,34,56,54,32);
        int count=list.stream().reduce(0,(a,b)->a+1);
        System.out.println("Count="+count);


    }
}
