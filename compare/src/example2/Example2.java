package example2;

import java.util.Comparator;
import java.util.TreeSet;

public class Example2 {

    public static void main(String args[]){

        Comparator<Dog> c1 = (d1,d2) -> d1.getAge() - d2.getAge();  //lambda expression
        Comparator<Dog> c2 = (d1,d2) -> d1.getName().compareTo(d2.getName());

        var set = new TreeSet<Dog>(c2);
         set.add(new Dog("A",4));
        set.add(new Dog("C",1));
        set.add(new Dog("D",3));
        set.add(new Dog("B",2));

        set.forEach(System.out::println);
    }
}

// with Comparator we can multiple rules to compare same object
// Collections                                   vs Collection
// is a class                                      is a interface
// have static method to work wit Collection        represent a Collection
// Collection.sort() | doesn't compile
