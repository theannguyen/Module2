package BaiTap4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số 1: ");
        int a = sc.nextInt();
        System.out.println("Nhập hệ số 2: ");
        int b = sc.nextInt();
        System.out.println("Nhập hệ số 3: ");
        int c = sc.nextInt();
        PtBac2 ptBac2 = new PtBac2(a, b, c);
        ptBac2.tinhNghiem();
    }
}
