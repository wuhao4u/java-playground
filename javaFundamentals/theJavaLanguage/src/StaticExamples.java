public class StaticExamples {
    static int x = 0;

    static void reassignStaticVariable(final int newX) {
        x = newX;
    }

    public static void main(String[] args) {
        System.out.println(x);
        reassignStaticVariable(10);
        System.out.println(x);
    }
}
