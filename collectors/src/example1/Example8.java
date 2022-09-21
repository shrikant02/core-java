package example1;

import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA","BB","C","DDDD","EEEEEEE","AAA");

        List<Integer> res =
        list.stream()
                .collect(Collectors.mapping(
                        s -> s.length(),
                        Collectors.filtering(
                                x -> x % 2 == 0,
                                Collectors.toList()
                        )
                )); // complex approach, don't use it real world scenarios
        System.out.println(res);

        List<Integer> res2 =
        list.stream()
                .map(x -> x.length())
                .filter(x -> x % 2 ==0)
                .collect(Collectors.toList());
        System.out.println(res2); // easy to read approach
    }
}
// we did down streaming 3 times
// mapping -> filtering even numbers -> collecting them in List