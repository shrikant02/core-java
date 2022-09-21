package intermediate2;

import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        // skip()
        // peek()
        // takeWhile()
        // dropWhile()

        list.stream() // 1,2,3,4,5,6,7,8,9,10
                .peek(x -> System.out.println(x)) //1,2,3,4,5,6,7,8,9,10
                .filter(p -> p % 2 == 0) // 2,4,6,8,10
                .forEach(System.out::println);
    }
}
// peek() just consumes the values, and we can do anything with it
// it passes the same Stream to the next function.


/*
*       List<Integer> input = List.of(1,2,3,4,5,6,7,8,9,10);
*       List<Integer> output = new ArrayList<>(); // 2,4,6,8,10 // we need even number in different list
        input.stream() // 1,2,3,4,5,6,7,8,9,10
        *       .filter(p -> p % 2 == 0)  // 2,4,6,8,10
                .peek(x -> output.add(x)) // not recommended
                .forEach(System.out::println);
                * */


/*   Recommended method for above scenario
*
*    List<Integer> input = List.of(1,2,3,4,5,6,7,8,9,10);
*       List<Integer> output = new ArrayList<>(); // 2,4,6,8,10 // we need even number in different list
        output = input.stream() // 1,2,3,4,5,6,7,8,9,10
        *       .filter(p -> p % 2 == 0)  // 2,4,6,8,10
                .collect(Collectors.toList());

* */