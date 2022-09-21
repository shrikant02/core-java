package lecture35;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example5 {

    public static void main(String args[]){
        Set<Integer> set1 = new LinkedHashSet<>(); //ordered

        set1.add(10);
        set1.add(100);
        set1.add(100); // this one didn't add to the set
        set1.add(200);
        set1.add(300);

        set1.forEach(x -> System.out.println(x));
    }
}

// it is the implementation of the HashSet
// use it when you want to save the order in which the elements are added

