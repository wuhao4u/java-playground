public class StringEquality {
    static void internSample() {
        String s1 = "I Love";
        s1 += " Java";

        String s2 = "I";
        s2 += " Love Java";

        compareStrings(s1, s2, "s1", "s2"); // different pointer, same value

        String s3 = s1.intern();
        compareStrings(s1, s3, "s1", "s3"); // same pointer, same value
        compareStrings(s2, s3, "s2", "s3"); // diff pointer, same value

        String s4 = s2.intern();
        compareStrings(s2, s4, "s2", "s4"); // same pointer, same value
        compareStrings(s3, s4, "s3", "s4"); // same pointer, same value
    }

    static void compareStrings(String s1, String s2, String s1Name, String s2Name) {
        if (s1 == s2) {
            System.out.println(s1Name + ' ' + s2Name + " have same reference.");
        } else {
            System.out.println(s1Name + ' ' + s2Name + " do NOT have same reference.");
        }


        if (s1.equals(s2)) {
            System.out.println(s1Name + ' ' + s2Name + " have same contents.");
        } else {
            System.out.println(s1Name + ' ' + s2Name + " do NOT have same contents.");
        }

        System.out.println(StringHelper.SEPARATOR40);
    }

    public static void main(String[] args) {
        StringEquality.internSample();
    }
}
