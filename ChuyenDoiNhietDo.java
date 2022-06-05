package ThucHanh3;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doF;
        double doC;
        int choice;

        //Sử dụng vòng lặp do/while và cấu trúc lựa chọn switch/case
        //để hiển in ra menu lựa chọn cho người dùng.
        do {
            System.out.println("Menu.");
            System.out.println("1. Chuyen F sang C");
            System.out.println("2. Chuyen C sang F");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhap do F: ");
                    doF = input.nextDouble();
                    System.out.println("Chuyen Do C sang Do F: " + fToC(doF));
                    break;
                }
                case 2: {
                    System.out.println("Nhap do C: ");
                    doC = input.nextDouble();
                    System.out.println("Chuyen Do F sang Do C: " + cToF(doC));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
        //Xây dựng phương thức chuyển đổi từ độ C sang độ F
        public static double cToF (double doC) {
            double doF = (9.0 / 5) * (doC + 32);
            return doF;
        }
            //Xây dựng phương thức chuyển đổi từ độ F sang độ C
            public static double fToC (double doF) {
                double doC = (5.0 / 9) * (doF - 32);
                return doC;
            }
        }

