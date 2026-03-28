import java.util.Arrays;
import java.util.List;

public class PracticeQ12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "cherry", "date");

        list.stream()
            .min(String::compareTo)
            .ifPresent(System.out::println);
    }
}
