package chapter05;

import java.util.Arrays;

/*
* number suffle
* */
public class Array06 {

    public static void main(String[] args) {
        int[] ary = new int[10];
        int temp;

        for (int i = 0; i < ary.length; i++) {
            ary[i] = i;
        }
        System.out.println(Arrays.toString(ary));

        // suffle
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 10);
            temp = ary[0];
            ary[0] = ary[num];
            ary[num] = temp;
        }
        System.out.println(Arrays.toString(ary));


    }
}
