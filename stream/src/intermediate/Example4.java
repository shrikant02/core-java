package intermediate;

import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<String> list = List.of("abdc","defgf","dfse");

        // Stream
        // map(Function)          Stream -> Stream
        // mapToInt(toIntFunction)     Stream -> IntStream
        // mapToLong(toLongFunction)    Stream -> LongStream
        // mapToDouble(toDoubleFunction)  Stream -> DoubleStream

        //IntStream
        // map(ToIntFunction)          IntStream -> IntStream
        // mapToInt()   // we can't do this because Stream is already IntStream
        // mapToDouble(IntToDoubleFunction)  IntStream -> DoubleStream
        // mapToLong(IntToLongFunction)    IntStream -> LongStream
        // mapToObj(IntFunction)     IntStream -> Stream // to convert back to Stream

        // LongStream, DoubleStream these above applies to these types also

        var x = list.stream() // "abdc","defgf","dfse"
                .mapToInt(s -> s.length()) // 4,5,4  // Stream -> IntStream
                .mapToObj(s -> s)
                .mapToInt(s -> s)
                .sum();
        System.out.println(x);
    }
}
// mapToInt()     Stream -> IntStream
// mapToLong()    Stream -> LongStream
// mapToDouble()  Stream -> DoubleStream
// these functions converts the Stream to more particular type of Stream like IntStream
// i.e. Streams of Integer
