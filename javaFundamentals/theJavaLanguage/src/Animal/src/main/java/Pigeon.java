public class Pigeon extends Omnivore implements Flyable {
    public void fly() {
        System.out.println("Fly in the city");
    }

    protected void move() {
        fly();
    }
}
