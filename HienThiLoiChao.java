package BaiTap1;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String name = nhap.nextLine();
        System.out.println("Xin chao: " + name);
    }
}
