package BaiTap2;

import java.util.Scanner;

public class HienThi20SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        System.out.printf("%d SNT dau tien la: \n", n);
        int count = 0; // Đếm SNT
        int N = 2; //Tìm SNT bắt đầu từ số 2
        while (count < n) {
            if (isPrimeNumber(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        //Số nguyên < 2 ko phải là SNT
        if (n < 2) {
            return false;
        }
        //Check SNT khi n > 2
        int squareRoot = (int) Math.sqrt(n);
        for (int N = 2; N <= squareRoot; N++) {
            if (n % N == 0) {
                return false;
            }
        }
        return true;
    }
}
