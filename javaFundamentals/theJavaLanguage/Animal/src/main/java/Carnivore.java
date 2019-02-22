public abstract class Carnivore extends Animal {
    public void eat() {
        System.out.println("Carnivores eat meat.");
    }

    protected void sleep() {
        System.out.println("Carnivores sleep long.");
    }

    protected void poop() {
        System.out.println("Carnivores poop sticks.");
    }

    protected abstract void move();
}
