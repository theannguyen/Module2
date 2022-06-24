package Bai15;

import java.util.Scanner;

//Tạo phương thức calc với đầu vào là 2 số nguyên x và y
// In ra kết quả Cộng, Trừ, Nhân, Chia.
//Khi y = 0 hoặc x = y = 0 sẽ xuất hiện thông báo lỗi ngoại lệ.
public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = scanner.nextInt();
        System.out.println("Nhap y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong x + y = " + a);
            System.out.println("Hieu x - y = " + b);
            System.out.println("Tich x * y = " + c);
            System.out.println("Thuong x / y = " + d);
        } catch (Exception e) {
            System.err.println("Xay ra ngoai le: " + e.getMessage());
        }
    }
}
