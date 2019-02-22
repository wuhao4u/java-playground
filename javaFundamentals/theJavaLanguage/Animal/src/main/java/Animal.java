import java.util.ArrayList;
import java.util.HashSet;

public abstract class Animal {
    public abstract void eat();
    protected abstract void sleep();
    protected abstract void poop();
    protected abstract void move();

    public static void main(String[] args) {
        /*
        ArrayList<Animal> animals = new ArrayList<Animal>(8);
        animals.add(new Cat());
        animals.add(new Dog());

        ArrayList<Flyable> birds = new ArrayList<Flyable>(8);
        birds.add(new Pigeon());
        birds.add(new Duck());
        */

        HashSet<Number> nonRepeatedNums = new HashSet<Number>(8);
        nonRepeatedNums.add(1);
        nonRepeatedNums.add(2);
        nonRepeatedNums.add(3.0);
        nonRepeatedNums.add(-0.21f);
        nonRepeatedNums.add(Short.MIN_VALUE);

//        nonRepeatedNums.forEach(i -> System.out.println(i));
        for (Number num : nonRepeatedNums) {
            System.out.println(num);
        }
    }
}
