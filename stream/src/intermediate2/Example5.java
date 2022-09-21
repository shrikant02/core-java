package intermediate2;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        // skip()
        // peek()
        // takeWhile()
        // dropWhile()

        list.stream() // 1,2,3,4,5,6,7,8,9,10
                .filter(x -> x % 2 == 0) // 2,4,6,8,10
                .skip(4) // 10 // skips the first 4 elements of the stream
                .forEach(System.out::println);
    }
}

// we can use skip() anywhere in the stream operation, like we did => calling skip() after the filter()