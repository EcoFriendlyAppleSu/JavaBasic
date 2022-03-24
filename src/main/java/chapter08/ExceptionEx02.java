package chapter08;

import java.util.Arrays;

public class ExceptionEx02 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4); // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("True");
            }
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("예외로 걸러지지 않은 부분을 처리할 수 있다.");
        }
        System.out.println(6);
    }
}
