package example1;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA","BB","C","DDDD","EEEEEEE","AAA");

        list.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> s.length(),
                        (a,b) -> a+b, // for duplicates
                        () -> new TreeMap<>() // when we want specific type of Map implementation
                ));
    }
}
// In above example, we also need to provide Comparator if natural ordering is not present
// in key type
// For TreeMap