package example1;

public class Cat implements Comparable<Cat>{

    private int age;

    public Cat(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        // < 0 if this < o
        // 0 if this == o
        // > 0 if this > o
        // we can write if else to do above
        return this.age - o.age;
    }
}

// Comparable is implemented such that, we can compare objects of different type thus we have to provide generic type while implementing,
// but we don't do that in real world scenarios ever.


