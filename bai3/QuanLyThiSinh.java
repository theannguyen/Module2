package LuyenTapOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThiSinh {
    private final ArrayList <LuyenTapOOP.ThiSinh> thiSinhArrayList = new ArrayList<>();

    public boolean checkSBD(int sbd) {
        for (LuyenTapOOP.ThiSinh thiSinh : thiSinhArrayList) {
            if (thiSinh.getSoBaoDanh() == sbd) {
                return true;
            }
        } return false;
    }
    public void themThiSinh(Scanner scanner) {
       LuyenTapOOP.ThiSinh thiSinh = new LuyenTapOOP.ThiSinh();
        System.out.println("Nhập thông tin Thí sinh mới");
        System.out.println("Nhập số báo danh: ");
        int sbd = scanner.nextInt();
        if (!checkSBD(sbd)) {
            System.out.println("Nhập họ tên: ");
            String hoTen = scanner.next();

            System.out.println("Nhập địa chỉ: ");
            String diaChi = scanner.next();

            System.out.println("Nhập mức ưu tiên: ");
            int mUT = scanner.nextInt();
            System.out.println("Nhập khối thi A / B / C: ");
            String khoiThi = scanner.next();
            switch (khoiThi) {
                case "A":
                    thiSinh = new LuyenTapOOP.KhoiA(sbd, mUT, hoTen, diaChi);
                    break;
                case "B":
                    thiSinh = new LuyenTapOOP.KhoiB(sbd, mUT, hoTen, diaChi);
                    break;
                case "C":
                    thiSinh = new LuyenTapOOP.KhoiC(sbd, mUT, hoTen, diaChi);
                    break;

            }
            thiSinhArrayList.add(thiSinh);
        } else {
            System.out.println("Trùng SBD");
        }
    }

    public void hienThi() {
        for (LuyenTapOOP.ThiSinh thiSinh : thiSinhArrayList) {
            System.out.println(thiSinh);
        }
    }
    public void timKiemThiSinh() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tìm kiếm theo SBD: ");
        int search = scanner.nextInt();
        if (checkSBD(search)) {
            for (LuyenTapOOP.ThiSinh thiSinh : thiSinhArrayList) {
                if (thiSinh.getSoBaoDanh() == search) {
                    System.out.println(thiSinh);
                }
            }
            } else {
            System.out.println("Ko có thí sinh");
        }
    }
}


