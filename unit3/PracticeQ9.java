import java.util.Arrays;
import java.util.List;

public class PracticeQ9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 50,30,80,20,90,40);

        list.stream()
            .sorted()
            .limit(3)
            .forEach(System.out::println);
    }
}
