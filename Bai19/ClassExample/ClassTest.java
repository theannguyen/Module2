package Bai19;

public class ClassTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[] {"C0123G", "A1234H", "P6789I"};
    public static final String[] invalidClass = new String[] {"123JQK", "6789AA", "10JQKA"};

    public static void main(String[] args) {
       classExample = new ClassExample();
       for (String className : validClass) {
            boolean isvalid = classExample.check(className);
           System.out.println("ClassExample is " + className + " is valid: " + isvalid);
        }
       for (String className : invalidClass) {
           boolean isvalid = classExample.check(className);
           System.out.println("ClassExample is " + className + " is valid: " + isvalid);
       }
    }
}
