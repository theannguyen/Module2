package BaiTap3;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        String chuoi;
        char kyTu = 'a';
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = sc.nextLine();

        //Duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            //Nếu ký tự tại vị trí i = 'a' thì tăng count lên 1
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự: " + kyTu + " trong chuỗi " + chuoi + " = " + count);
    }
}
