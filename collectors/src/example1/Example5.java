package example1;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA","BB","C","DDDD","EEEEEEE","AAA");

        String res1 =
        list.stream()
                .collect(Collectors.joining()); // will concatenate the all the values in Stream and return single value
        System.out.println(res1);

        String res2 =
        list.stream()
                .collect(Collectors.joining(",")); // will add the separator (,) in the String
        System.out.println(res2);

        String res3 =
        list.stream()
                .collect(Collectors.joining(",","[","]"));
        System.out.println(res3);


    }
}
