public class Cat extends Carnivore{
    public void eat() {
        System.out.println("fish.");
    }

    protected void sleep() {
        System.out.println("sleep 2/3 of the day.");
    }

    protected void poop() {
        System.out.println("in the sand.");
    }

    protected void move() {
        walk();
    }

    public void walk() {
        System.out.println("Cat walk.");
    }
}
