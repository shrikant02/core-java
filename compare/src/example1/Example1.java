package example1;

import java.util.TreeSet;

public class Example1 {

    public static void main(String args[]){
        var set1 = new TreeSet<Cat>();

        set1.add(new Cat(4));
        set1.add(new Cat(1));
        set1.add(new Cat(6));
        set1.add(new Cat(5));

        set1.forEach(System.out::println);
    }
}

// Wrapper classes for primitive type already implement natural order eg Integer and String
// TreeSet sorts elements by default
// TreeSet will throw exception when we try to add element in set, because it will try to sort the element when we
// add it to the set
