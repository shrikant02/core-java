package example1;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA","BB","C","DDDD","EEEEEEE","AAA");

        List<Integer> res =
        list.stream()
                .collect(Collectors.mapping(
                        s -> s.length(), // will the map the values
                        Collectors.toList() // will the collect the mapped values in List
                ));
        System.out.println(res);
    }
}
// first argument -> used to map the values
// secong argument -> what to do with them after mapping // downstreaming