package chapter09.CopyPkg;

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle circle1 = new Circle(new Point(3, 4), 2.0);
        Circle circle2 = circle1.shallowCopy();
        Circle circle3 = circle1.deepCopy();

        System.out.println("circle1 = " + circle1);
        System.out.println("circle2 = " + circle2);
        System.out.println("circle3 = " + circle3);

        circle1.point.setX(10);
        circle1.point.setY(20);
        System.out.println("-----------------------------");
        System.out.println("circle1 = " + circle1);
        System.out.println("circle2 = " + circle2);
        System.out.println("circle3 = " + circle3);
    }
}
