package chapter09;

import java.util.Date;

public class ToStringTest {
    public static void main(String[] args) {

        String str = new String("USA");
        Date date = new Date();

        System.out.println(str);
        System.out.println(str.equals("USA"));
        System.out.println(str.toString());

        System.out.println(date);
        System.out.println(date.toString()); // Object에서 overriding을 한 함수 toString
    }
}
