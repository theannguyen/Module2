package Bai16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    private static String path;

    public void readFileText(String filePath) {
        try {
            //Đọc file theo đường dẫn
            File file = new File(filePath);
            
            //Kiểm tra nếu file ko tồn tại thì ném ra ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            
            //Đọc từng dòng của file và tiến hành cộng lại
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            
            //Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            //TH file ko tồn tại hoặc nội dung file có lỗi thì sẽ
            //hiển thị thông báo lỗi
            System.err.println("File ko tồn tại hoặc nội dung có lỗi");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}