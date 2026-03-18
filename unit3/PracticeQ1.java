
import java.util.*;

//package unit3;

public class PracticeQ1 {
    public static void main(String[] args) {
        ArrayList<Integer> L=new ArrayList<Integer>();
        L.addAll(List.of(10,15,20,25,30,11,17,16));
        // L.stream().filter(n->.forEach((n)->{if(n%2==0){
        //     System.out.println(n);
        // }}));
        L.stream().filter((n)->n%2==0).forEach((n)->System.out.print(n+" "));

    }
}
