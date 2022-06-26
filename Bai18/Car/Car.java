package Bai18;

import java.util.Random;

import static Bai18.Main.DISTANCE;
import static Bai18.Main.STEP;

public class Car implements Runnable{
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        //Khởi tạo điểm start
        int runDistance = 0;
        //Khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();
        //Kiểm tra nếu xe chưa kết thúc quãng đường
        //thì tiếp tục chạy
        while (runDistance < DISTANCE) {
            try {
                //Random Speed KM/H
                int speed = (new Random()). nextInt(30);
                //Calculate traveled distance
                runDistance += speed;
                //Build result graphic
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE,runDistance) + "KM");
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
