public class Duck extends Omnivore implements Flyable{
    public void fly() {
        System.out.println("Fly low");
    }

    protected void move() {
        fly();
    }
}
