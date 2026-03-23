import java.util.Arrays;
import java.util.List;

public class ReduceQ8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfSquares = list.stream()
                               .map(x -> x * x).reduce(0, (a, b) -> a + b); 
        System.out.println("Sum of squares="+sumOfSquares);
    }
}
