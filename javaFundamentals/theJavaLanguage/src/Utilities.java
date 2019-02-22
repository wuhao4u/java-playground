public class Utilities {
    public static void compareObjects(Object o1, Object o2) {
        if (o1 == o2) {
            System.out.println("o1 and o2 have same reference.");
        } else {
            System.out.println("o1 and o2 do NOT have same reference.");
        }


        if (o1.equals(o2)) {
            System.out.println("o1 and o2 have same contents.");
        } else {
            System.out.println("o1 and o2 do NOT have same contents.");
        }

        System.out.println(StringHelper.SEPARATOR40);
    }

    public static void compareObjects(Object o1, Object o2, String o1Name, String o2Name) {
        if (o1 == o2) {
            System.out.println(o1Name + ' ' + o2Name + " have same reference.");
        } else {
            System.out.println(o1Name + ' ' + o2Name + " do NOT have same reference.");
        }


        if (o1.equals(o2)) {
            System.out.println(o1Name + ' ' + o2Name + " have same contents.");
        } else {
            System.out.println(o1Name + ' ' + o2Name + " do NOT have same contents.");
        }

        System.out.println(StringHelper.SEPARATOR40);
    }

}
