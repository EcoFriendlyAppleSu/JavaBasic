package chapter12_Enums.enumEx03;

public class enumEx03 {
    public static void main(String[] args) {
        System.out.println("bus Fare = " + Transportation.BUS.fare(100));
        System.out.println("bus Fare = " + Transportation.TRAIN.fare(100));
        System.out.println("bus Fare = " + Transportation.SHIP.fare(100));
        System.out.println("bus Fare = " + Transportation.AIRPLANE.fare(100));

    }
}
