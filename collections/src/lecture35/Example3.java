package lecture35;

import java.util.Set;

public class Example3 {

    public static void main(String args[]){
        Set<Integer> set1 = Set.of(10,100,200,300);

        for(Integer x : set1)
            System.out.println(x);
    }
}

// duplicates are not allowed , not indexed thus can don't have get method, and not ordered
// Set.of method will throw exceptions when adding duplicates.
