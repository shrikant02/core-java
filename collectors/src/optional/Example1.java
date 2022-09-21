package optional;

import java.util.Optional;

public class Example1 {
    public static void main(String[] args) {
        // Optional class was introduced in java 8
        String s = null;
        int n = s.length(); // NullPointerException
    }

    static Optional<String> m(){ //
        return Optional.empty();
    }
}
// by using Optional, we make aware that this Optional might have value or might not have value
// rather than using nulls, we use this