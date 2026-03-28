import java.util.Arrays;
import java.util.List;

public class PracticeQ14 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anika", "Rahul", "Anika", "Priya", "Rahul");

        list.stream()
            .distinct()
            .forEach(System.out::println);
    }
}
