package ThucHanh2;

import java.util.Scanner;

public class UdTinhTienLaiChoVay {
    public static void main(String[] args) {
        double tienGui = 1.0;
        int soThang = 1;
        double laiSuat = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so tien gui: ");
        tienGui = input.nextDouble();

        System.out.println("Nhap so thang: ");
        soThang = input.nextInt();

        System.out.println("Nhap lai suat hang nam theo ty le %: ");
        laiSuat = input.nextDouble();

        double tongLaiSuat = 0;
        for (int i = 0; i < soThang; i++) {
            tongLaiSuat += tienGui * (laiSuat/100)/12 * soThang;
            System.out.println("Tong so tien lai suat theo tung thang la: " + tongLaiSuat);
        }
    }
}
