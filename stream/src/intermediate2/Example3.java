package intermediate2;

import java.util.stream.Stream;

public class Example3 {
    public static void main(String[] args) {
        Stream<Cat> s = Stream.of(
                new Cat(2),
                new Cat(5),
                new Cat(1),
                new Cat(6),
                new Cat(4)
        );

        s.sorted()
                .forEach(c -> System.out.println(c.getAge()));
    }
}
