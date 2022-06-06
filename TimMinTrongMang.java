package BaiTap3;

import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Nhập số lượng phần tử: ");
        size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Phần tử: " + (i+1));
            arr[i] = sc.nextInt();
        }
        int findMin = arr[0];
        for (int i = 2; i < size; i++) {
            if (findMin > arr[i]) {
                findMin = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + findMin);
    }
}
