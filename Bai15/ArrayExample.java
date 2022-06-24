package Bai15;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    //Tạo phương thức creatRandom trả về mảng số nguyên ngẫu nhiên từ 0 -> 100
    public Integer[] creatRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    //Tạo hàm main cho phép người dùng nhập vào chỉ số của một phần tử bất kỳ
    //đồng thời tìm kiếm giá trị phần tử theo chỉ số đó dựa trên mảng vừa tạo
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập chỉ số của 1 phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gía trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
