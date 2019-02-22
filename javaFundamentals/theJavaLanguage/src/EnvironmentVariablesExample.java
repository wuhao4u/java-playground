public class EnvironmentVariablesExample {
    public static void main(String[] args) {
        String compName = System.getenv("COMPUTERNAME");
        String sysRoot = System.getenv("HOME");
        String author = System.getenv("COURSE_AUTHOR");

        System.out.println(compName);
        System.out.println(sysRoot);
        System.out.println(author);
    }
}
