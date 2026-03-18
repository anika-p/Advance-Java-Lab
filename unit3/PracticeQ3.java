//package unit3;

import java.util.ArrayList;
import java.util.List;

public class PracticeQ3 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.addAll(List.of(10,60,45,90,30,24,50,76));
        list.stream()
        .filter((n)->n>=50 && n<=60)
        .forEach(System.out::println);
    }
}
