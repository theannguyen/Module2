package Bai19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    //Tạo một biến static String ACCOUNT_REGEX chứa định dạng
    //regularExpression của tài khoản. Sau đó tạo một phương thức
    //validate để kiểm tra tài tài khoản cần kiểm tra có hợp lệ với
    //ACCOUNT_REGEX đã định nghĩa hay ko

    //Không chứa các ký tự đặc biệt
    //Phải dài hơn 6 ký tự
    // Không chứa các ký tự viết hoa
    // Cho phép dấu gạch dưới (_)
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample() {
    }

    public boolean validate (String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
