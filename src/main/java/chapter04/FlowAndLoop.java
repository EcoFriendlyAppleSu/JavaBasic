package chapter04;

import java.util.Optional;
import java.util.Scanner;

public class FlowAndLoop {
    public static void main(String[] args) throws Exception {
        char score = ' ';
        System.out.println("------------ program start -----------");
        while (true) {
            char flag = ' ';
            Scanner scanner = new Scanner(System.in);
            String temp = scanner.nextLine();

            if (!(temp.chars().allMatch(Character::isDigit))) {
                System.out.println("정확한 숫자를 입력해 주세요");
                continue;
            } else {
                switch (Integer.parseInt(temp) / 10) {
                    case 9:
                        score = 'A';
                        continue;
                    case 8:
                        score = 'B';
                        continue;
                    default:
                        System.out.println("점수가 충분하지 않습니다.");
                        flag = 'F';
                        break;
                }
            }
            if (flag == 'F') {
                break;
            }
        }

    }
}
