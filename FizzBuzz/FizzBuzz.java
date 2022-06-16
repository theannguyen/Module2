package BaiTap9;

public class FizzBuzz {
    public static String checkNumberDivThree(int a) {
        if (a % 3 == 0) {
            return "Fizz";
        }
        return null;
    }

    public static String checkNumberDivFive(int a) {
        if (a % 5 == 0) {
            return "Buzz";
        }
        return null;
    }

    public static String checkNumberDivThreeAndFive(int a) {
        if (a % 3 == 0 & a % 5 == 0) {
            return "FizzBuzz";
        }
        return null;
    }

    public static String checkNumberContainThree( String a) {
        if (a.contains("three")) {
            return "Fizz";
        }
        return null;
    }

    public static String checkNumberContainFive( String a) {
        if (a.contains("five")) {
            return "Buzz";
        }
        return null;
    }
}
