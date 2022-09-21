package example1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA","BB","C","DDDD","EEEEEEE","AAA");

        Map<Integer, List<String>> map =
        list.stream()
                .collect(Collectors.groupingBy( // grouping them by their
                        s -> s.length()         // length
                ));
        System.out.println(map);
        // {1=[C], 2=[BB], 3=[AAA, AAA], 4=[DDDD], 7=[EEEEEEE]}


        Map<Integer, String> map2 =
        list.stream()
                .collect(Collectors.groupingBy(
                        s -> s.length(),
                        Collectors.mapping(
                                s -> String.valueOf(s),
                                Collectors.joining())
                ));
        System.out.println(map2);
    }
}
