package chapter11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx03Practice {
    public static void main(String[] args) {
        HashSet<Integer> setInteger = new HashSet<>();
        int[][] bingo = new int[5][5];

        for (int i = 0; setInteger.size() < 25; i++) {
            setInteger.add(Integer.valueOf((int) (Math.random() * 50 + 1)));
        }

        Iterator<Integer> iterator = setInteger.iterator();

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                System.out.print((bingo[i][j] < 10 ? " " : " ") + iterator.next());
            }
            System.out.println();
        }

    }
}
