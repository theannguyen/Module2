package ThucHanh;

import java.util.Scanner;

public class TinhCanNang {
    public static void main(String[] args) {
        Scanner tinh = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Nhap can nang: ");
        weight = tinh.nextDouble();

        System.out.print("Nhap chieu cao: ");
        height = tinh.nextDouble();

        //Sử dụng hàm Math.pow(x, 2) để bình phương 1 số
        bmi = weight / Math.pow(height, 2);

        //Hiển thị chỉ số và phân loại kết quả
        System.out.printf("%-20s%s", "bmi", "\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Ban dang thieu can");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Chi so can nang binh thuong");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Ban dang thua can");
        else
            System.out.printf("%-20.2f%s", bmi, "Ban dang beo phi!");
    }
}
