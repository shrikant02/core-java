package lecture35;

import java.util.*;

public class Example2 {

    Set<Integer> set1 = new HashSet<>();  // not ordered and not sorted
    Set<Integer> set2 = new LinkedHashSet<>(); //ordered
    Set<Integer> set3 = new TreeSet<>();  // sorted | in ascending order

    Set<Integer> set4 = Set.of(1,2,3);

    // Lists vs                    Sets
    // ordered                  not (always) ordered
    // indexed                  not indexed
    // do allow duplicates      do not allow duplicates
    // No set allows duplicates
}
