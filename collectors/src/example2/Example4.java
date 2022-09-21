package example2;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA","BB","C","DDDDDD","E");

        int res1 =
        list.stream()
                .mapToInt(s -> s.length())
                .sum();

        long res2 =
        list.stream()
                 .mapToInt(s -> s.length())
                 .count();

        var res3 =
        list.stream()
                  .mapToInt(s -> s.length())
                  .average();

        IntSummaryStatistics res4 =
        list.stream()
                .mapToInt(s -> s.length())
                .summaryStatistics(); // if we need all the statistics like above, we can do it like this
        System.out.println(res4.getMax());

        IntSummaryStatistics res5 =
        list.stream()
                .collect(Collectors.summarizingInt(s -> s.length())); // above example using collectors
        System.out.println(res5.getMin());
    }
}
