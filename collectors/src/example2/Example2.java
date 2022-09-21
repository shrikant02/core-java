package example2;

import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA","BB","C","DDDDDD","E");

        double res1 =
        list.stream()
                .collect(Collectors.averagingInt(s -> s.length()));
        System.out.println(res1);
        // averagingInt, averagingLong, averagingDouble
    }
}
