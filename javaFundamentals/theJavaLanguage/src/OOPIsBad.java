public class OOPIsBad {
    public static void testSubScope() {
        int outX = 0;

        {
            int inX = 1;
            System.out.println(inX);
            System.out.println(outX);
        }

        System.out.println(outX);
    }

    public static void testAnonymousFunction() {

    }

    public static void main(String[] args) {
        OOPIsBad.testSubScope();
    }
}
