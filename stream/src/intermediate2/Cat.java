package intermediate2;

public class Cat implements Comparable<Cat> {
    private int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Cat c) {
        return this.getAge() - c.getAge();
    }
}
