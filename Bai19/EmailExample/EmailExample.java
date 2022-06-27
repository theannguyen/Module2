package Bai19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    //Tạo 1 biến static String EMAIL_REGEX chứa định dạng regular expression
    //của email. Sau đó tạo 1 phương thức validate để kiểm tra email cần kiểm tra
    //có hợp lệ với EMAIL_REGEX đã định nghĩa hay ko
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validates(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
