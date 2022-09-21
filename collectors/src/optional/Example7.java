package optional;

import java.util.Optional;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty(); //empty box
        Optional<Integer> o2 = Optional.of(11);

        var res =
        o2.stream() // stream of one element
                .collect(Collectors.counting());
        System.out.println(res);

        var res2 =
        o2.filter(x -> x % 2 == 0)
                .orElse(-1);
        System.out.println(res2);

    }
}
