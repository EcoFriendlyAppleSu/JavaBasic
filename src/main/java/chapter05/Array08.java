package chapter05;

import java.util.Arrays;

public class Array08 {
    public static void main(String[] args) {

        int[] ary = new int[10];
        int[] count = new int[10];

        for (int i = 0; i < ary.length; i++) {
            ary[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(ary));

        for (int i = 0; i < ary.length; i++) {
            count[ary[i]]++;
        }

        for (int i = 0; i < ary.length; i++) {
            System.out.printf("숫자 %d는 %d번 나왔습니다.\n", i, count[i]);
        }

    }
}
