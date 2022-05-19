package chapter11;

import java.util.TreeSet;

public class TreeSetEx03 {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        int[] score = {80, 90, 50, 40, 35, 20, 100};

        for (int i = 0; i < score.length; i++) {
            integerTreeSet.add(Integer.valueOf(score[i]));
        }

        System.out.println("50 보다 작은 값 = " + integerTreeSet.headSet(50));
        System.out.println("50 보다 큰 값 = " + integerTreeSet.tailSet(50));

    }
}
