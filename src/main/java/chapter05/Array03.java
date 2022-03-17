package chapter05;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {
        int[] ary1 = {1, 2, 3, 4, 5};

        for (int temp : ary1) {
            System.out.println("temp = " + temp);
        }

        //copy 진행
        int[] ary2 = new int[ary1.length * 2];
        for (int i = 0; i < ary1.length; i++) {
            ary2[i] = ary1[i];
        }

        for (int i = 0; i < ary2.length; i++) {
            System.out.printf("ary2[%d]\t = %d \n", i,ary2[i]);
        }

        for (int temp : ary2) {
            System.out.printf("temp = %d, ary[temp] = %d\n", temp,ary2[temp]);
        }

        int[] ary3 = {1, 3, 5, 7, 9};
        for (int temp :
                ary3) {
            System.out.printf("temp = %d, ary[temp] = %d\n", temp, ary3[temp]);
        }

        System.out.println(ary2);

        char[] abc = {'A', 'B', 'C', 'D', 'E'};
        char[] num = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] result = new char[abc.length + num.length];

        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(Arrays.toString(result));

        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(Arrays.toString(num));

        System.arraycopy(abc, 0, num, 6, 4);
        System.out.println(Arrays.toString(num));

    }
}
