package BaiTap4;

public class StopWatch {
    private double starTime;
    private double endTime;

    public StopWatch() {
    }

    public void getStartTime() {
        starTime = System.currentTimeMillis();
    }

    public void getEndTime() {
        endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - starTime;
    }
}
