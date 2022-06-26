package Bai16;

import java.util.List;

public class FindMaxValue {
    //Tạo phương thức findMax với đối số là 1 List<Integer>
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    //Gọi các phương thức đọc và ghi file
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("C:\\Users\\ADMIN\\Documents\\Module2\\demo\\src\\Bai16\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("C:\\Users\\ADMIN\\Documents\\Module2\\demo\\src\\Bai16\\result.txt", maxValue);
    }
}
