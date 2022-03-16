package chapter03;

import java.util.Scanner;

public class OperatorEx04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch1 = scanner.next().charAt(0);

        if (('a' <= ch1 && ch1 <= 'z') || ('A' <= ch1 && ch1 <= 'Z')) {
            System.out.println("문자입니다.");
        } else {
            System.out.println("문자가 아닙니다..");
        }
    }
}
