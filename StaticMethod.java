package ThucHanh5;

public class StaticMethod {
    private static class Student {
        //Xây dựng lớp .., xây dựng phương thức tĩnh change()
        private int rollno;
        private String name;
        private static String college = "BBDIT";

        //Khởi tạo hàm và biến
        Student (int r, String n) {
            rollno = r;
            name = n;
        }

        //Tạo phương thức static để thay đổi giá trị của biến static
        static void change() {
            college = "CODEGYM";
        }

        //Tạo phương thức hiển thị giá trị
        void display() {
            System.out.println(rollno + " " + name + " " + college);
        }
    }

    public static void main(String[] args) {
        Student.change(); //Gọi phương thức change()

        //Khởi tạo đối tượng
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //Gọi phương thức display() để hiển thị
        s1.display();
        s2.display();
        s3.display();
    }
}
