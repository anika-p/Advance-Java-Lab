import java.util.Arrays;
import java.util.List;

public class ReduceEx {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(34,12,45,76,34,56,54,32);
        int sum=list.stream().reduce(0,(a,b)->a+b);
        int mul=list.stream().reduce(1,(a,b)->a*b);

        //System.out.println("Sum="+sum);
        //System.out.println("Product="+mul);

        //double avg=sum/list.size();
        double avg=list.stream().reduce(0,(a,b)->a+b)/list.size();
        
        System.out.println("Avg="+avg);
    }
}
