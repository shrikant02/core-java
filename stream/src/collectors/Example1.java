package collectors;

import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7);

        List<Integer> list1 =
                list.stream()
                .map(x -> x*2)
                .collect(Collectors.toList()); // will collect them in the List<>

        System.out.println(list1);
    }
}
