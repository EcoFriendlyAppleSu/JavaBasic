package chapter07;

public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);
    }
}

class PointState {
    int x = 10;
    int y = 10;

    public PointState(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends PointState {
    int z = 30;

    public Point3D() {
        this(100, 200, 300);
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
