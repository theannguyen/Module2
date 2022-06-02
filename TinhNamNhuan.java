package ThucHanh;

import java.util.Scanner;

public class TinhNamNhuan {
    public static void main(String[] args) {
        int Year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam: ");
        Year = scanner.nextInt();
        if (Year % 400 == 0 || (Year % 4 == 0 && Year % 100 != 0)) {
            System.out.println("Nam nhuan");
        } else {
            System.out.println("Ko la nam nhuan");
        }
    }
}
