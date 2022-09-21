package main;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,5,6,7,8,9);
//        for(Integer i: list){
//            if(i % 2 == 0)
//                System.out.println(i);
//        }
        list.stream() // source
                .filter(x -> x % 2 == 0) // intermediate operations
                .forEach(System.out::println); // terminal operation
    }
}

/*
* source and terminal operations are mandatory
* we can have zero or more intermediate operations
* */
