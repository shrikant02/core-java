package intermediate;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = List.of("abdc","defgf","dfse");

        // java.util.function -> Function<T,R>  T is input and R is output
        // Function<T,T> --> UnaryOperator<T>
        // Function<T,Boolean> --> Predicate<T>

        var output = list.stream()
                .map(x -> x.length())   //  4 ,5 ,4  // map() is used to convert the type of stream items
                .reduce(0,(a,b) -> a+b);  // reduce is used to add the elements // second argument is BinaryOperator
        // 0 + 4  = 4
        // 4 + 5 = 9
        // 9 + 4 = 13
        System.out.println(output);
    }
}
// map() --> transforming the input to the output type // in above example String to their length