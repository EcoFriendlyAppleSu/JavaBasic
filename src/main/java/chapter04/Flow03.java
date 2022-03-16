package chapter04;

import java.util.Scanner;

public class Flow03 {
    public static void main(String[] args) {

        char grade = ' ';

        System.out.print("받은 점수를 입력해주세요 (1 to 100) : ");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        int number = Integer.parseInt(temp);

        switch (number / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'F';
                break;
        }
        System.out.printf("당신의 학점은 %c입니다.", grade);
    }
}
