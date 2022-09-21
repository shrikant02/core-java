package optional;

import java.util.Optional;

public class Example3 {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty(); //empty box
        Optional<Integer> o2 = Optional.of(10);

        if(o2.isPresent()){
            Integer i = o2.get(); // make sure our Optional is not empty or it will throw error
        }
    }
}
