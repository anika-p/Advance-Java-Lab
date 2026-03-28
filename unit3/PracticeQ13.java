import java.util.Arrays;
import java.util.List;

public class PracticeQ13 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "cherry", "date");

        list.stream()
            .max((a,b)->a.compareTo(b))
            .ifPresent(System.out::println);
    }
}
