public class PrimitiveWrapperSamples {
    static void convertsDemo() {
        Integer a = 100;
        int b = a;
        Integer c = b;

        Integer d = Integer.valueOf(100);
        int e = d.intValue();
        Integer f = Integer.valueOf(e);

        Integer g = Integer.valueOf(a);

        System.out.println("Done!");
    }

    static void stringToPrimitive() {
        int a = Integer.parseInt("100");
        int b = Integer.parseInt("0000");
        int c = Integer.parseInt("-10");
        int d = Integer.parseInt("010");
//        int c = Integer.parseInt("3.14"); // will throw an error

        String sa = String.valueOf(100); // primitive int to String

        System.out.println("Done!");
    }

    static void stringToWrapper() {
        Integer a = Integer.valueOf("100");
        int b = Integer.valueOf("100"); // implicit cast Integer to int

        String sa = String.valueOf(a); // wrapper type Integer to String
    }


    static void wrapperEquality() {
        Integer i1000A = 10 * 10 * 10;
        Integer i1000B = 100 * 10;

        Utilities.compareObjects(i1000A, i1000B);

        Integer i8A = 4 * 2;
        Integer i8B = 2*2*2;

        // small Integers uses same references, similar to String.intern()
        Utilities.compareObjects(i8A, i8B);
    }

    public static void main(String[] args) {
//        PrimitiveWrapperSamples.convertsDemo();
//        PrimitiveWrapperSamples.stringToPrimitive();
        wrapperEquality();
    }
}
