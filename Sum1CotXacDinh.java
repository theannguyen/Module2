package BaiTap3;

import java.util.Scanner;

public class Sum1CotXacDinh {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so cot muon tinh tong: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][n];
        }
        System.out.println("Ket qua cot " + n + " la: " + sum);

    }
}
