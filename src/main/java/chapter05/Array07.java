package chapter05;

import java.util.Arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] num = new int[6];

        // random number input
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 45);
        }

        // sorting
        for (int i = 0; i < num.length - 1; i++) {
            boolean changed = false;
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
            System.out.println(Arrays.toString(num));
        }

    }
}
