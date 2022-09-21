package intermediate2;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,6,5,4,2,9,83,4,8,7,2);

        Comparator<Integer> c = Collections.reverseOrder();
        list.stream()
                .distinct()
                .sorted(c)
                .forEach(System.out::println);
    }
}
// we sorted the elements using our Comparator rather than the natural ordering of the elements
