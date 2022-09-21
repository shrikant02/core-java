package lecture35;

import java.util.HashSet;
import java.util.Set;

public class Example4 {

    public static void main(String args[]){

        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(100);
        set1.add(100); // this one didn't add to the set
        set1.add(200);
        set1.add(300);

        set1.forEach(x -> System.out.println(x));
    }
}

// adding duplicate method using add() method in set will not throw error it will just not add the duplicate
// HashSet uses hashCode() method to arrange the objects inside the Collection such it makes them easier to find
// fastest collection in Java - use it when we want to retrieve object very fast from the bag of collection
// when we make HashSet of the User defined class then we have to override the hasCode and equals method.
