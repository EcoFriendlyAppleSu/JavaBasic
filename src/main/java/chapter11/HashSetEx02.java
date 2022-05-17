package chapter11;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * HashSet 순서 유지할 때 사용
 */
public class HashSetEx02 {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 6; i++) {
                int number = (int) (Math.random() * 45);
                set.add(number);
            }
            LinkedList linkedList = new LinkedList<>(set);
            Collections.sort(linkedList);
            System.out.println(linkedList);
            set.clear();
            linkedList.clear();
        }



    }
}
