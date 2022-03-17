package chapter05;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        int[] iAry1 = new int[10];
        int[] iAry2 = new int[10];
        // int[] iAry3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] iAry3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        char[] chrAry = {'a', 'b', 'c', 'd', 'e'};

        for (int i = 0; i < iAry1.length; i++) {
            iAry1[i] = i;
        }

        for (int i = 0; i < iAry2.length; i++) {
            iAry2[i] = ((int) Math.random() * 10) + 1;
        }

        System.out.println(Arrays.toString(iAry1));
        System.out.println(Arrays.toString(iAry2));
        for (int i = 0; i < iAry3.length; i++) {
            System.out.printf("%d\t", iAry3[i]);
        }
        System.out.println();
        System.out.println(iAry1);
        System.out.println(chrAry);
    }
}
