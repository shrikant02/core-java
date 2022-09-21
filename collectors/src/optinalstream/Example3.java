package optinalstream;

import java.util.List;
import java.util.Optional;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = List.of();

        int res1 =
        list.stream()
                .reduce(0,(x,y) -> x + y); // if list is empty, reduce() will return 0 , passed as first argument

        Optional<Integer> res2 =
        list.stream()
                .reduce((x,y) -> x + y); // if list is empty reduce() will return empty Optional

        System.out.println(res1); // 0
        System.out.println(res2.isPresent()); // false
    }
}
