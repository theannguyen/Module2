package BaiTap5;

public class AccessModifier {
    public static void main(String[] args) {
        Circle circle = new Circle(1, "red");
        System.out.println("Diện tích là: " + circle.getArea());
    }

}
class Circle {
    private double radius = 1.0;
    private String color = "red";


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getArea(){
        return (Math.PI* Math.pow(this.radius,2));
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}