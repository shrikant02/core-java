package optinalstream;

import java.util.Optional;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.empty();
        Stream<Integer> s2 = Stream.of(10,23,30,40);

        Optional<Integer> o1 = s1.findFirst();
        if(o1.isPresent()){
            System.out.println(o1.get());
        }

    }
}
