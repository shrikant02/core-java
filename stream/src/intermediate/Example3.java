package intermediate;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<String> list = List.of("abdc","defgf","dfse");

        list.stream() // "abdc","defgf","dfse"
                .map(x -> new StringBuilder(x).reverse().toString()) // "cdba", "fgfed", "esfd"
                .forEach(System.out::println);
    }
}
