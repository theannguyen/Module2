package Bai17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nhật Tinh Ngao", "Hà Nội"));
        students.add(new Student(2, "Ưng Hoàng Cóc", "Sơn La"));
        students.add(new Student(3, "Nam Mộ Dung", "Hà Nội"));
        students.add(new Student(4, "Bắc Kiều Phong", "Hà Nội"));
        students.add(new Student(5, "Tây Môn Khánh", "Hà Nội"));
        writeToFile("C:\\Users\\ADMIN\\Documents\\Module2\\demo\\src\\Bai17\\Student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("C:\\Users\\ADMIN\\Documents\\Module2\\demo\\src\\Bai17\\Student.txt");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }
}
