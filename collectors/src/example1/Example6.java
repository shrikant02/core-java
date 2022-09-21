package example1;

import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA","BB","C","DDDD","EEEEEEE","AAA");

        var res =
        list.stream()
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.joining(),
                        (a,b) -> List.of(a,b)
                ));
        System.out.println(res);
    }
}
