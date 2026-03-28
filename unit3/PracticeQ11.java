import java.util.Arrays;
import java.util.List;

public class PracticeQ11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,15,20,25,30,35,40,45);

        list.stream()
            .skip(5)
            .limit(3)
            .forEach(System.out::println);
    }
}
