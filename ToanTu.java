package ThucHanh;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); //Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width = scanner.nextFloat(); //Nhập chiều rộng

        System.out.println("Enter height: ");
        height = scanner.nextFloat(); //Nhập chiều dài

        //Tính diện tích của hình chữ nhật và hiển thị ra màn hình
        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
