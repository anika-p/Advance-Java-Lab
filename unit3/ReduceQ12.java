import java.util.Arrays;
import java.util.List;

public class ReduceQ12 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(12,34,56,78);
        // int number = 1234;

        // int sum = String.valueOf(number)
        //                 .chars()             
        //                 .map(c -> c - '0')          
        //                 .reduce(0, (a, b) -> a + b);

        // System.out.println("Sum of digits: " + sum);
        String result = list.stream()
                            .map(n->n.toString())     
                            .reduce("", (a, b) -> a + b);

        System.out.println("Result: " + result);
    }


    
}
