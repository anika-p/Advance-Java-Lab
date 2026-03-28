import java.util.Arrays;
import java.util.List;

public class PracticeQ15 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anika", "Rahul", "Priya", "Aman", "Neha", "Riya");

        list.stream()
            .limit(5)
            .forEach(System.out::println);
    }
}
