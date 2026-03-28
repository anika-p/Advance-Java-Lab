import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PracticeQ10 {
    public static void main(String[] args) {
        
    
    List<Integer> list=Arrays.asList(10,20);
    Optional<Integer> res=list.stream().distinct().max((a,b)->a-b);
    System.out.println(res);
    }
    
}
