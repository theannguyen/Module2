package BaiTap3;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int n;
        int i;
        int c;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhap vao so phan tu cua mang: ");
            n = sc.nextInt();
        } while (n <= 0);

        int Array[] = new int[n];
        System.out.println("Nhap cac phan tu cho mang: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            Array[i] = sc.nextInt();
        }
        System.out.println("Nhap so nguyen X: ");
        int X = sc.nextInt();

        //Xóa phần tử X ra khỏi mảng
        //Vòng lặp for sẽ khởi tạo c = i = 0
        //và duyệt i từ 0 đến n
        //Nếu phần tử tại vị trí i khác với số nguyên X
        //thì gán phần tử tại i cho phần tử tại K
        //Sau đó tăng c lên 1
        for (c = i = 0; i < n; i++) {
            if (Array[i] != X) {
                Array[c] = Array[i];
                c++;
            }
        }
        n = c; //Lúc này số phần tử trong mảng sẽ = c

        //Hiển thị các phần tử trong mảng sau khi xóa X
        System.out.println("Mang con lai sau khi xoa X " + X + " la: ");
        for (i = 0; i < n; i++) {
            System.out.print(Array[i] + "\t");
        }
    }
}
