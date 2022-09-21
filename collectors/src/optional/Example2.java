package optional;

import java.util.Optional;

public class Example2 {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty(); //empty box
        Optional<Integer> o2 = Optional.of(10);

        //Optional<Integer> o2 = Optional.of(null) --> using null with of() throws an Exception
        //Optional<Integer> o2 = Optional.of(m()); // throws Exception whenever m() returns null

        Optional<Integer> o3 = Optional.ofNullable(10);// will create box with 10 inside
        Optional<Integer> o4 = Optional.ofNullable(m()); // will not throw Exception and create empty box
        //when we are not sure use this

        boolean b1 = o1.isPresent(); // false
        boolean b2 = o2.isPresent(); // true
    }
    static Integer m(){
        return null;
    }
}
