package chapter11;

import java.util.Stack;

public class StackEx01 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.nate");
        goURL("2.daum");
        goURL("3.naver");
        goURL("4.google");

        printStatus();

        goBack();
        System.out.println(" 뒤로 가기 버튼 ");
        printStatus();

        goBack();
        System.out.println(" 뒤로 가기 버튼 ");
        printStatus();

        goForward();
        System.out.println(" 앞으로 가기 버튼 ");
        printStatus();

        goURL("codeJava.com");
        System.out.println("= new address move");
        printStatus();

    }

    private static void printStatus() {
        System.out.println("back = " + back);
        System.out.println("forward = " + forward);
        System.out.println("현재 화면은 :" + back.peek() + " 입니다.");
        System.out.println();

    }

    private static void goBack() {
        if (!back.empty()) {
            forward.push(back.pop());
        }
    }

    private static void goForward() {
        if (!forward.empty()) {
            back.push(forward.pop());
        }
    }

    private static void goURL(String s) {
        back.push(s);
        if (!forward.empty()) {
            forward.clear();
        }
    }


}
