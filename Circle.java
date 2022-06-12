package BaiTap6;

public class Circle {
    private double radius = 3.5;
    private String color = "red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
}
