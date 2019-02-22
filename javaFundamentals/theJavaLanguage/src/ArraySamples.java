public class ArraySamples {
    public static float sumOfArray(float[] inputFloats) {
        float sum = 0.0f;

        for (float f : inputFloats) {
            sum += f;
        }

        return sum;
    }


    public static void main(String[] args) {
        ArraySamples as = new ArraySamples();

        float[] a1 = {10.0f, 20.0f, 15.0f};

        System.out.println(as.sumOfArray(a1));
    }
}
