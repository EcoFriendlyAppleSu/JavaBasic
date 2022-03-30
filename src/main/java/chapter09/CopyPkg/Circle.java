package chapter09.CopyPkg;

class Circle implements Cloneable{
    Point point;
    private double r;

    public Circle(Point point, double r) {
        this.point = point;
        this.r = r;
    }

    public Circle shallowCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Circle) obj;
    }

    public Circle deepCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}

        Circle c = (Circle) obj;
        c.point = new Point(this.point.getX(), this.point.getY());

        return c;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", r=" + r +
                '}';
    }
}
