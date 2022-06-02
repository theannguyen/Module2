package ThucHanh;
import java.util.Scanner;

public class Giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        float a, b, c;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = nhap.nextFloat();

        System.out.println("Nhap so b: ");
        b = nhap.nextFloat();

        System.out.println("Nhap so c: ");
        c = nhap.nextFloat();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Vo so nghiem");
            }
            else {
                System.out.println("Pt vo nghiem");
            }
        }
        else {
            float kq = (c - b) / a;
            System.out.println("Nghiem cua pt la: " + kq);
        }
    }
}