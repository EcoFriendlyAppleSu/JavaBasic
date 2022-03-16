package chapter04;

import java.util.Scanner;

public class Flow02 {
    public static void main(String[] args) {

        System.out.println("가위(1), 바위(2), 보(3) 게임");

        System.out.println("사용자 숫자를 입력해 주세요 (1 ~ 3) : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int computerNumber = (int) (Math.random() * 3) + 1; //  0.0 <= Math.random < 1.0

        System.out.printf("User number is = %d\n", num);
        System.out.printf("Computer number is = %d\n", computerNumber);

        switch (computerNumber - num) {
            case 2:
            case -1:
                System.out.println(" 컴퓨터가 승리했습니다.");
                break;
            case 1:
            case -2:
                System.out.println(" 유저가 승리했습니다.");
                break;
            case 0:
                System.out.println(" 비겼습니다.");
        }
    }
}
