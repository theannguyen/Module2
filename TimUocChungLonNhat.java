package ThucHanh2;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = input.nextInt();
        System.out.println("Nhap so b: ");
        b = input.nextInt();
        //Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        a = Math.abs(a);
        b = Math.abs(b);

        //Kiểm tra a, b có bằng 0 hay ko
        if (a == 0 || b == 0) {
            System.out.println("Khong co uoc so chung lon nhat");
        }
        //Tìm ước số chung lớn nhất của a, b
        //Sử dụng vòng lặp kiểm tra trong khi a khác b thì
        //Nếu a < b: a = a – b
        //Còn lại b = b – a
        //Từ đó chúng ta sẽ có đoạn code như sau
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
            //Kết thúc vòng lặp in ra ước số chung lớn nhất của a, b là a
            System.out.println("Uoc so chung lon nhat la: " + a);
        }
    }
}
