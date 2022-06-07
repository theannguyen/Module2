package BaiTap3;

import java.util.Scanner;

public class SumMaTranVuong {
    public static void main(String[] args) {
        int n; //Biến của ma trận vuông
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào bậc của ma trận: ");
        n = sc.nextInt();

        int A[][] = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma trận A vừa nhập: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        //Các phần tử nằm trên đường chéo chính
        //là các phần tử có chỉ số dòng = chỉ số cột
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //Kiểm tra nếu i == j thì tính tổng
                if (i == j) {
                    sum += A[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính: " + sum);
    }
}
