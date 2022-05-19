package chapter11;

import java.util.TreeSet;

public class TreeSetEx01 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; treeSet.size() < 6; i++) {
            treeSet.add(Integer.valueOf((int) (Math.random() * 45 + 1)));
        }
        System.out.println(treeSet);
    }
}
