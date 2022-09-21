package intermediate2;

import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,50,100,130,150);

//        list.stream()
//                .takeWhile(x -> x <= 100) // while(condition)
//                .forEach(System.out::println);

        list.stream()
                .dropWhile(x -> x <= 100) // while(condition)
                .forEach(System.out::println);
    }
}
