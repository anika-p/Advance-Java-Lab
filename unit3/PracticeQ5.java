//package unit3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeQ5 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.addAll(List.of("Java",null,"Spring",null,"React"));
        List<String> lang=list.stream()
        .filter(n->n!=null)
        .collect(Collectors.toList());

        System.out.println(list);

        // lang.stream()
        // .filter(Objects::nonNull)
        // .forEach(System.out::println);
        System.out.println(lang);
    }
}
