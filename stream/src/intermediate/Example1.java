package intermediate;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {

        List<Integer> l1 = List.of(1,2,3,4,5,6,7,8);

        boolean b1 = l1.stream().allMatch(x -> x % 2 ==0); // true
        boolean b2 = l1.stream().anyMatch(x -> x % 2 ==0); // false
        boolean b3 = l1.stream().noneMatch(x -> x % 2 ==0); // false

    }
}
