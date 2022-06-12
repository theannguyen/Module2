package BaiTap6;

public class Cylinder extends Circle {
private double height;
private double width;


    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height, double width) {
        super(radius, color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return super.getArea()*2 + super.getPerimeter()*this.height;
    }

    @Override
    public double getPerimeter() {
        return super.getArea()*this.height;
    }
}
