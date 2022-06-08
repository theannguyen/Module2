package ThucHanh5;

public class StaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "BMW 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6", "BMW 6");
        System.out.println(Car.numberOfCars);
    }
}
