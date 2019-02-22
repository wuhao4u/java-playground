public abstract class Herbivore extends Animal {
    public void eat() {
        System.out.println("Herbivore eat plants.");
    }

    protected void sleep() {
        System.out.println("Carnivores sleep intermitly.");
    }

    protected void poop() {
        System.out.println("Carnivores poop small.");
    }

    protected abstract void move();
}
