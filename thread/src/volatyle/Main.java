package volatyle;

public class Main {

    public static volatile int b = 0;
    public static void main(String[] args) {

    }
}

/* problem statement =>
our three thread are running in different cpu so the value changed by the IncrementingThread is not known by the Printing one
as they are running in different buffered memory.

solution => we can use volatile keyword in this case it will transfer all the changes made to the main thread i.e. Main.b

volatile does not solve synchronization problem
*/


