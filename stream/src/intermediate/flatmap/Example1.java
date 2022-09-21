package intermediate.flatmap;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {

        List<List<Integer>> list = List.of(
                List.of(1,2,3,4,5),
                List.of(5,6,7),
                List.of(9,8)
        );

        var ouput =
        list.stream()
                .flatMap(q -> q.stream())
                .reduce(0,(a,b) -> a+b);

        System.out.println(ouput);
    }
}
