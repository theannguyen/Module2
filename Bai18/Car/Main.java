package Bai18;

public class Main {
   public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
//Ký hiệu = đánh dấu quãng đường mà xe đã đi qua
//Ký hiệu o đánh dấu xe đang ở vị trí đó
//Ký hiệu - đánh dấu quãng đường còn lại về đích
//Ký hiệu | đánh dấu xuất phát và đích