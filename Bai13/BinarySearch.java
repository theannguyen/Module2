package Bai13;

//Tạo lớp BinarySearch, khai báo một mảng số nguyên
//được sắp xếp theo thứ tự tăng dần.
public class BinarySearch {
    static int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    //Cài đặt phương thức binarySearch(int[] list, int key).

    static int binarySearch(int [] list, int key) {
        int low = 0;
        int high = list.length -1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
            }
        return -1;  /* Now high < low, key not found */
        }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 3));
        System.out.println(binarySearch(list, 4));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 6));
    }
    }

