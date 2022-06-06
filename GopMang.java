package BaiTap3;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        //Khai báo và khởi tạo giá trị
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        //Khai báo biến arr3 = độ dài 2 mảng + lại
        int arr3 = arr1.length + arr2.length;
        //Khai báo mảng mới result để lưu trữ 2 mảng cần nối
        int[] result = new int[arr3];
        int i = 0;
        //Sử dụng vòng lặp for để lưu phần tử trong mảng arr1 vào mảng result
        for (int element: arr1) {
            result[i] = element;
            i++;
        }
        //Làm tương tự với mảng 2
        for (int element: arr2) {
            result[i] = element;
            i++;
        }
        //Sau khi nối xong, hiển thị mảng result
        System.out.println(Arrays.toString(result));
    }
}
