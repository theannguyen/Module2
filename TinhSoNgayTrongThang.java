package ThucHanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        //Nhập số ngày của tháng muốn tìm
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thang: ");
        int month = scanner.nextInt();

//        switch (month) {
//            //Tính số ngày của tháng 2
//            case 2:
//                System.out.print("Thang '2' co 28 hoac 29 ngay");
//                break;
//                //Tính số ngày của các tháng có 31 ngày
////            case 1:
////                System.out.print("Thang ' " + month + " ' co 31 ngay");
////                break;
////                //Tính số ngày của tháng 3
////            case 3:
////            System.out.print("Thang '" + month + " 'co 31 ngay");
////            break;
//            //Ở đây bắt đầu xuất hiện mã lặp.
//            //Với cấu trúc switch, nếu sau mỗi case không có câu chỉ dẫn break,
//            //các case sau đó vẫn được xem xét thực thi,
//            //điều này giúp ta thực thi cùng một khối chỉ dẫn cho nhiều case:
//            //Bổ sung các case còn lại của trường hợp tháng có 31 ngày:
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.print("Thang '" + month + "' co 31 ngay");
//                break;
//                //Tính số ngày của các tháng có 30 ngày:
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.print("Thang '" + month + "' co 30 ngay");
//                break;
//            default:
//                System.out.print("Invalid input");
//                break;

                //Khử mã lặp
            //Chương trình tiếp tục xuất hiện mã lặp, chúng ta cần khử nợ kỹ thuật này trước khi bài toán được coi là hoàn thành.
        String daysInmonth;
        switch (month) {
            case 2:
                daysInmonth = "28 hoac 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInmonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInmonth = "30";
                break;
            default:
                daysInmonth = "";
        }
        if (!daysInmonth.equals("")) System.out.printf("Thang '%d' co %s ngay", month, daysInmonth);
        else System.out.print("Invalid input!");
    }
}
