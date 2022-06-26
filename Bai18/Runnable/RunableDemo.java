package Bai18;

public class RunableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    public RunableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    //Phương thức run thực hiện việc hiển thị luồng nào đang được thực hiện.
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " +i);
                //Dừng vòng lặp trong 50ms
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    //Phương thức start() được sử dụng để tạo ra các luồng với tên tương ứng
    public void start() {
        System.out.println("Staring " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        System.out.println("Main thread running...");

        RunableDemo runableDemo1 = new RunableDemo("Thread-1-HR-Database");
        runableDemo1.start();

        RunableDemo runableDemo2 = new RunableDemo("Thread-2-Send-Email");
        runableDemo2.start();

        System.out.println("Main thread stopped!!!");
    }
}
