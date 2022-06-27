package Bai19;

public class EmailExampleTest {
    private static EmailExample emailExample;

    //Xây dựng mẫu email hợp lệ để kiểm thử
    //a@gmail.com
    //ab@yahoo.com
    //abc@hotmail.com

    //Xây dựng mẫu email ko hợp lệ để kiểm thử
    //@gmail.com
    //ab@gmail.
    //@#abc@gmail.com
    public static final String[] validEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validates(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validates(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }
}
