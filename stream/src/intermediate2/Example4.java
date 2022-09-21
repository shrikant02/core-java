package intermediate2;

import java.util.Comparator;
import java.util.stream.Stream;

public class Example4 {
    public static void main(String[] args) {
        Stream<Dog> s = Stream.of(
                new Dog(2),
                new Dog(5),
                new Dog(1),
                new Dog(6),
                new Dog(4)
        );

        Comparator<Dog> comp = (d1,d2) -> d1.getAge() - d2.getAge();
        s.sorted(comp)
                .forEach(x -> System.out.println(x.getAge()));
    }
}
