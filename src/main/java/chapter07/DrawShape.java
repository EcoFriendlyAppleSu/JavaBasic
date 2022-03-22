package chapter07;

public class DrawShape {
    public static void main(String[] args) {
        Point[] triPoint = {
                new Point(140, 120),
                new Point(150, 200),
                new Point(160, 900)
        };

        Triangle triangle = new Triangle(triPoint);
        Circle circle = new Circle(new Point(30, 30), 25);

        triangle.draw();
        circle.draw();
    }
}

class Point {
    public int x;
    public int y;

    Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getXY() {
        return "(" + x + "," + y + ")";
    }
}

class Shape {
    public String color = "black";
    void draw() {
        System.out.printf("color = %s\n", color);
    }
}

class Circle extends Shape {
    Point center; // 참조 변수만 선언
    int r;

    Circle() {
        this(new Point(0, 0), 100); // 이 부분에서 인스턴스 생성 발생
    }

    public Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    /*
    Point point = new Point();
    Circle circle = new Circle(Point, r);
    */

    void draw() {
        System.out.printf("center = (%d, %d), r = %d, color = %s\n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape{
    Point[] center = new Point[3];

    public Triangle(Point[] center) {
        this.center = center;
    }

    void draw() {
        System.out.printf("p1 = %s\t p2 = %s\t p3 = %s\n", center[0].getXY(), center[1].getXY(), center[2].getXY());
    }
}