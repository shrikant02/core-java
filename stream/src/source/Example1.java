package source;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

// how to create sources for stream
public class Example1 {

    public static void main(String[] args) {
        Stream<Integer> i1 = Stream.empty(); //finite
        Stream<Integer> i2 = Stream.of(1,4,5,6,7,8,9,4,3); //finite

        Supplier<Integer> sup = () -> new Random().nextInt();
//        Stream<Integer> s3 = Stream.generate(sup);  // infinite
//
//        s3.limit(10)
//                .forEach(System.out::println);
//        Stream s3 = Stream.iterate(1,integer -> integer +1); // second argument is unary operator(functional interface) takes input and returns the output of the same type
//        s3.limit(10)
//                .forEach(System.out::println);

        Stream s4 = Stream.iterate(1,i -> i <= 10, i -> i+1); // its like a for loop
        s4.forEach(System.out::println);


    }

    public List<Integer> m1(){
        // does something
        return Collections.emptyList();
    }
    public Stream<Integer> m2(){
        // does something
        return  Stream.empty();
    }
    // we use empty streams to avoid returning null values
}
