package BaiTap6;

import java.util.Arrays;

public class MoveablePoint extends Point {
    float xSpeed;
    float ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float array[] = new float[2];
        array[0] = this.xSpeed;
        array[1] = this.ySpeed;
        return new float[]{
                this.x, this.y
        };
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                '}' + Arrays.toString(move());
    }

    public float[] move() {
        float array[] = new float[2];
        array[0] = this.xSpeed + getX();
        array[1] = this.ySpeed + getY();
        return array;
    }
}
