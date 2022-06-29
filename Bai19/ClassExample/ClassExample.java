package Bai19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static final String CLASS_NAME = "[A-Z][0-9]{4}[G-M]";

    public ClassExample() {
    }

    public boolean check(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
