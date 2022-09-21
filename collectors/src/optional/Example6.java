package optional;

import java.util.Optional;

public class Example6 {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty(); //empty box
        Optional<Integer> o2 = Optional.of(10);

        o2.ifPresent(x -> {
            System.out.println(x);
        });

        o2.ifPresentOrElse(x -> {

        }, () -> {

        });
    }
}
