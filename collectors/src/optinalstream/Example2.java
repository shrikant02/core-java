package optinalstream;

import java.util.List;
import java.util.Optional;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);

        Optional<Integer> o1 =
        list.stream()
                .min((x,y) -> x - y);

        o1.ifPresent(System.out::println);
    }
}
