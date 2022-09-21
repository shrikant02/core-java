package collectors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,1,4,2);

        Set<Integer> list1 =
                list.stream() // 1,2,3,4,5,6,7,1,4,2
                .map(x -> x*2) // 2* (1,2,3,4,5,6,7,1,4,2)
                .collect(Collectors.toSet()); // will collect them in the Set<> // duplicates will be removed because Set
         // doesn't allow duplicates
        System.out.println(list1);
    }
}
