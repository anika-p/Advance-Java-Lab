import java.util.Arrays;
import java.util.List;

public class ReduceQ7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API","Reduce");
        String result = words.stream().reduce("", (a, b) -> a + b);
        System.out.println(result);
    }
}
