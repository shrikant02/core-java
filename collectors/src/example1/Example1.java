package example1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA","BB","C","DDDD","EEEEEEE");

        List<String> l =
        list.stream()
                // intermediary operations
                 .collect(Collectors.toList());

        Set<String> s =
                list.stream()
                 .collect(Collectors.toSet());

        TreeSet<String> ts =
        list.stream()
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
// collect() is applying the Collectors.toList()'s logic to every element in Stream
// it's basically telling how to the collect the Stream