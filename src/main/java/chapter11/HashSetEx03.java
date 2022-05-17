package chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx03 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[][] bingo = new int[5][5];

        // set의 사이즈를 정해주지 않아도 중복되지 않는 값을 가질 경우 요소가 하나씩 추가된다.
        for (int i = 0; set.size() < 25; i++) {
            set.add(Integer.valueOf((int) (Math.random() * 50 + 1)));
        }

        Iterator<Integer> iterator = set.iterator();

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                System.out.print((bingo[i][j] < 10 ? " " : " ") + iterator.next());
            }
            System.out.println();
        }

    }
}
