package example1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA","BB","C","DDDD","EEEEEEE","AAA");

        Map<String, Integer> map1 =
        list.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> s.length(),
                        (a, b) -> a+b // will sum up the values if we duplicate key
                        // this bi function is only duplicates, because we can't have duplicates in Map
                ));

        System.out.println(map1);

    }

}
