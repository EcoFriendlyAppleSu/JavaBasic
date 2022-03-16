package chapter04;

import java.util.Scanner;

/*
* 성적 분류
* */
public class Flow01 {
    public static void main(String[] args) {

        char grade = ' ';
        char opt = '0';

        System.out.print("성적을 입력해 주세요 : ");

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        System.out.printf("당신의 점수는 (1 ~ 100) : %d", score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }

        System.out.printf("당신의 학점은 %c%c입니다.", grade, opt);

    }
}
