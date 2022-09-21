package intermediate.flatmap;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = List.of("asd34t5a","fsdf667","dfsdg2fsg");

        String digits = "01234456789";

        var output =
        list.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .filter(s -> digits.contains(s))
                .count();

        System.out.println(output);
    }
}
