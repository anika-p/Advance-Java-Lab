//package unit3;

import java.util.ArrayList;
import java.util.List;

public class PracticeQ4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.addAll(List.of("Java","Python","C","React","C#","Next.js","Node.js"));
        list.stream()
        .filter((n)->n.length()>4)
        .forEach((System.out::println));
    }
}
