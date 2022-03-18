package chapter05;

import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        final int SIZE = 5;
        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = {
                {1, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 1, 0},
                {1, 0, 0, 1},
        };

        int row = 0;
        int col = 0;

        // init board
        for (int i = 0; i < SIZE; i++) {
                board[i][0] = board[0][i] = (char) (i + '0');
            }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("====연속된 두 수를 입력하세요=====");
            String tempString = scanner.nextLine();

            if (tempString.length() == 2) {
                row = tempString.charAt(0) - '0'; // 문자를 숫자로 변환
                col = tempString.charAt(1) - '0';

                if (row == 0 && col == 0) {
                    break;
                }
            }

            if (tempString.length() != 2 || row <= 0 || row >= SIZE || col <= 0 || col >= SIZE) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            board[row][col] = shipBoard[row - 1][col - 1] == 1 ? 'O' : 'X';

            for (int i = 0; i < SIZE; i++) { // char type의 배열이라 println으로 연이어 출력이 가능하다.
                System.out.println(board[i]);
            }
            System.out.println();

        }
    }
}
