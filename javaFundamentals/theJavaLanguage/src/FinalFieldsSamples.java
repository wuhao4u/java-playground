public class FinalFieldsSamples {
    // pi is a universal constant, about as constant as anything can be.
    public static final double PI = 3.141592653589793;

    public final double radius = 0.2;

    {
//        radius = 0.1;
    }

    public FinalFieldsSamples() {
//        radius = 0.5;
    }

    public static void main(String[] args) {
        FinalFieldsSamples ffs = new FinalFieldsSamples();

        System.out.println(ffs.radius);
    }
}
