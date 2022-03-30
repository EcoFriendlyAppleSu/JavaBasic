package chapter09;

public class CloneEx01 {
    public static void main(String[] args) {
        Point original = new Point(3, 4);
        Point copyPoint = (Point) original.clone();
        System.out.println(original);
        System.out.println(copyPoint);

        System.out.println(original.hashCode());
        System.out.println(copyPoint.hashCode()); // 복제된 새로운 인스턴스의 해쉬값은 다르다.

        System.out.println(original.equals(copyPoint));

    }
}
