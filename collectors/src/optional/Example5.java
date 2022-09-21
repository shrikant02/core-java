package optional;

import java.util.Optional;

public class Example5 {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty(); //empty box
        Optional<Integer> o2 = Optional.of(10);

        Integer i1 = o2.map(x -> x*2).orElse(-1);
        //System.out.println(i1);

        var i2 = o2.flatMap(x -> Optional.of(x)).orElse(-1);
        System.out.println(i2);
    }
}
