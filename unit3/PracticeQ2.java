
import java.lang.*;
import java.util.*;

//package unit3;

public class PracticeQ2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.addAll(List.of("Amit","Ravi","Anil","Vikas","Ashok","Rahul"));
        list.stream()
        .filter((n)->n.startsWith("A"))
        .forEach((System.out::println));
    }
}
