package BaiTap3;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int n;
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao vi tri muon them: ");
        int index = sc.nextInt();
        do {
            System.out.println("Nhap vao so phan tu cua mang: ");
            n = sc.nextInt();
        } while (n <= 0);

        int Array[] = new int[n];
        System.out.println("Nhap cac phan tu cho mang: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            Array[i] = sc.nextInt();
        }
        System.out.println("Nhap so nguyen X: ");
        int X = sc.nextInt();
        int newArray[] = new int[n + 1];
        for (int j = 0; j < index; j++) {
            newArray[j] = Array[j];
        }
        for (int j = index; j < (n + 1); j++) {
            //n+1 là chiều dài của mảng mới
            if (j != index) {
                newArray[j] = Array[j - 1];
            } else {
                newArray[j] = X;
            }
        }
        for (int k = 0; k < newArray.length; k++) {
            System.out.println(newArray[k]);
        }
    }
}
