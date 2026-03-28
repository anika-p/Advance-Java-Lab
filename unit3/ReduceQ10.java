import java.util.Arrays;
import java.util.List;

public class ReduceQ10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Stream", "API", "Programming","Functional");

        String longest = list.stream()
                             .reduce("", (a,b) -> a.length()>b.length() ? a:b);

        System.out.println("Longest String: " + longest);
    }

}
