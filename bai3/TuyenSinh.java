package LuyenTapOOP;

import java.util.Scanner;

public class TuyenSinh {
    public static void main(String[] args) {
        LuyenTapOOP.QuanLyThiSinh quanLyThiSinh = new LuyenTapOOP.QuanLyThiSinh();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm mới thí sinh");
            System.out.println("2. Hiển thị thông tin Thí sinh");
            System.out.println("3. Tìm kiếm theo SBD");
            System.out.println("0. Thoát khỏi chương trình");
            System.out.println("Lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    quanLyThiSinh.themThiSinh(scanner);
                    break;
                case 2:
                    quanLyThiSinh.hienThi();
                    break;
                case 3:
                quanLyThiSinh.timKiemThiSinh();
                break;
            }
        } while (choice != 0);
    }


}
