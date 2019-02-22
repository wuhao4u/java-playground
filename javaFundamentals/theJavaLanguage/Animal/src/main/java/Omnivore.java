public abstract class Omnivore extends Animal{
    public void eat() {
        System.out.println("eat anything");
    }

    protected void sleep() {
        System.out.println("sleep medium length");
    }

    protected void poop() {
        System.out.println("mixed");
    }

    protected abstract void move();
}
