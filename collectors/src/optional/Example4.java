package optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Example4 {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty(); //empty box
        Optional<Integer> o2 = Optional.of(10);

        Integer i1 = o1.orElse(-1); // -1
        Integer i2 = o2.orElse(-1); // 10

        Supplier<Integer> s1 = () -> -1;
        Integer i3 = o1.orElseGet(s1);

        Integer i4 = o2.orElseThrow(() -> new RuntimeException()); // in real world we will have our own custom exception

        Integer i5 = o1.or(() -> o2).orElse(-1);// try o1 and o2 if both don't have values then -1 //10

        o1.ifPresentOrElse(x -> {
            System.out.println(x); // this consumer will run if value is present
        }, () -> {
            System.out.println("no value"); // or this Runnable will run if values is not present
        });
    }
}
