import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedQ11 {
    public static void main(String[] args) {
        
    
    List<String> names = Arrays.asList("Ravi","Zoya","Meena","Kunal");

    List<String> sortedList=names.stream()
             .sorted(Comparator.reverseOrder()).toList();

    System.out.println(sortedList);
}
}
