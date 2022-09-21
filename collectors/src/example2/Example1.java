package example2;

import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA","BB","C","DDDDDD","E");

        int res1 =
        list.stream()
                .mapToInt(s -> s.length())
                .sum();
        System.out.println(res1);
        // normal approach with intermediary operations -> we can also do this using Collectors
        // collect() is terminal operation

        int res2 =
        list.stream()
                .collect(Collectors.summingInt(s -> s.length()));
        System.out.println(res2);

        // summingInt, summingLong, summingDouble
    }
}
// After using the Collector we specify what to do wit the elements is downstreaming