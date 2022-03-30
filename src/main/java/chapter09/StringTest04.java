package chapter09;

public class StringTest04 {
    public static void main(String[] args) {
        Integer integer = new Integer(4);
        Integer integer1 = new Integer(10);
        int x = 4;

        System.out.println(integer == integer1);
        System.out.println(integer.equals(integer1));
        System.out.println(integer.compareTo(5));

    }
}
