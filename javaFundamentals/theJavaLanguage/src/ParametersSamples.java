public class ParametersSamples {
    static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    static void printInts(int... list) {
        for (int i :
                list) {
            System.out.println(i);
        }
        System.out.println(StringHelper.SEPARATOR40);
    }

    static void testSwap() {
                int val1 = 10;
        int val2 = 20;

        System.out.println("Before swap");

        System.out.println(val1);
        System.out.println(val2);

        System.out.println(StringHelper.SEPARATOR80);

        swap(val1, val2);

        System.out.println("After swap");
        System.out.println(val1);
        System.out.println(val2);

        System.out.println(StringHelper.SEPARATOR80);

        System.out.println("After swap outside");
        int temp = val1;
        val1 = val2;
        val2 = temp;
        System.out.println(val1);
        System.out.println(val2);
    }

    static void testVarargs() {
        printInts(1,2,3,4,5);
        printInts(-10, 0, 5, 10);
    }

    public static void main(String[] args) {
        testVarargs();
    }
}
