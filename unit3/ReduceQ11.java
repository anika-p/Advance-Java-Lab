import java.util.Arrays;
import java.util.List;

public class ReduceQ11 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,20,30,40,50);
        
        double avg=list.stream().reduce(0,(a,b)->a+b)/list.size();
        
        System.out.println("Avg="+avg);
    }
}
