package Bai19;

import java.util.regex.Pattern;

public class TelephoneExample {
//    private static final String TEL_NUM = "^\\([0-9]{2}\\(-\\([0-9]{10}\\)$";
//
//
//    public TelephoneExample() {
//    }
//
//    public boolean checkNum(String regex) {
//        Pattern pattern = Pattern.compile(TEL_NUM);
//        Matcher matcher = pattern.matcher(regex);
//        return matcher.matches();
public static void main(String[] args) {
    String s = "(84)-(0987228496)";
    System.out.println(Pattern.matches("^\\([0-9]{2}\\)(-)\\([0-9]{10}\\$",s));
}
}
