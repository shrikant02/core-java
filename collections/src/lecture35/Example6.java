package lecture35;

import java.util.Set;
import java.util.TreeSet;

public class Example6 {

    public static void main(String args[]){

        Set<Integer> set1 = new TreeSet<>(); //sorted
        set1.add(10);
        set1.add(100);
        set1.add(100); // this one didn't add to the set
        set1.add(200);
        set1.add(300);
        set1.forEach(x -> System.out.println(x));
    }
}

// TreeSet is ordered
// it is also a NavigableSet and a SortedSet

