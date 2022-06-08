package BaiTap5;

public class Student {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.setName());
        System.out.println(test.setClasses());
    }
}
    class Test {
            private String name = "John";
            private String classes = "C02";

        public void setName(String name) {
            this.name = name;
        }

        public void setClasses(String classes) {
            this.classes = classes;
        }

        public String setName() {
            return name;
        }

        public String setClasses() {
            return classes;
        }
    }
