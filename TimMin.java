package ThucHanh3;

public class TimMin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index = minValue(arr);
        System.out.println("So nho nhat trong mang la: " + arr[index]);
    }

    //Cài đặt nguyên mẫu phương thức
    //Sử dụng phép lặp để duyệt mảng và trả về index
    //của phần tử có giá trị nhỏ nhất trong mảng
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}