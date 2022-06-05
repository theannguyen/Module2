package ThucHanh3;

import java.util.Scanner;

public class SoLuongSinhVien {
    public static void main(String[] args) {
        //Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so luong sinh vien: ");
            size = sc.nextInt();
            if (size > 30)
                System.out.println("Vuot qua 30 sinh vien");
        } while (size > 30);
        //Nhập giá trị cho các phần tử của mảng (Nhập điểm cho từng sinh viên)
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhap diem cho sinh vien " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        //Sử dụng vòng lặp for để in ra danh sách điểm vừa nhập,
        //đồng thời đếm số lượng sinh viên thi đỗ
        //Điểm đỗ từ 5 trở lên
        int count = 0;
        System.out.print("Danh sach diem cua sinh vien: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n So luong sinh vien thi do la: " + count);
    }
}
