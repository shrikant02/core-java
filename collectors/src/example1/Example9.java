package example1;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA","BB","C","DDDD","EEEEEEE","AAA");

        Map<Boolean, List<String>> map1 =
        list.stream()
                .collect(Collectors.partitioningBy(s -> s.length() % 2 ==0));
// partition the values based on the predicate passed
        System.out.println(map1);

        Map<Boolean, Set<String>> map2 =
        list.stream()
                .collect(Collectors.partitioningBy(
                        s -> s.length() % 2 ==0 ,
                        Collectors.toSet()
                        // we did down streaming here and collected them in Set of strings
                ));
        System.out.println(map2);

        Map<Boolean, String> map3 =
        list.stream()
                .collect(Collectors.partitioningBy(
                        s -> s.length() % 2 ==0,
                        Collectors.joining()
                        // we did down streaming here and joined the values after that
                ));
        System.out.println(map3);

        Map<Boolean, String> map4 =
        list.stream()
                .collect(Collectors.partitioningBy(
                        s -> s.length() % 2 ==0,
                        Collectors.mapping(
                                s -> String.valueOf(s.length()),
                                Collectors.joining()
                        )
                ));
        System.out.println(map4);
    }
}
