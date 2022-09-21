package intermediate2;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,6,5,4,2,9,83,4,8,7,2);

        // distinct()
        // sorted / sorted(Comparator)

        list.stream()
                .distinct() // return distinct stream of elements duplicates will be removed
                .sorted()
                .forEach(System.out::println);

//        list.stream()
//                .sorted() // return distinct stream of elements duplicates will be removed
//                .distinct()
//                .forEach(System.out::println);
        // this code will generate same output as above but is less perfomant because calling so
        // sorted() makes the sorting algo to sort more element
        // not in the case if we call distinct() first.
    }
}
