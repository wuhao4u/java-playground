public class Dog extends Omnivore implements Walkable {
    protected void move() {
        walk();
    }

    public void walk() {
        System.out.println("Runs fast");
    }
}
