import java.util.Arrays;
import java.util.List;

public class SortedQ10 {
    public static void main(String[] args) {
        
    
    List<String> names = Arrays.asList("Ravi","Zoya","Meena","Kunal");

    List<String> sortedList=names.stream()
             .sorted().toList();

    System.out.println(sortedList);
}
}