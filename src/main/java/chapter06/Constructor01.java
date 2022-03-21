package chapter06;

public class Constructor01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.gearType + car1.color + car1.door);
        Car car2 = new Car("blue");
        System.out.println(car2.gearType + car2.color + car2.door);

    }
}

class Car {

    public String color;
    public String gearType;
    public int door;

    Car() {
        this("white", "auto", 4);

    }

    Car(String color) {
        this(color, "auto", 4);
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
