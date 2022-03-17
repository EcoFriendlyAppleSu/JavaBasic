package chapter05;

/*
 * Max, Min program
 * */
public class Array05 {
    public static void main(String[] args) {

        int[] ary = {4, 6, 2, 7, 9, 10};
        int Max = ary[0];
        int Min = ary[0];
        int temp;

        for (int i = 0; i < ary.length; i++) {
            if (Max < ary[i]) {
                Max = ary[i];
            } else if (Min > ary[i]) {
                Min = ary[i];
            }
        }

        System.out.printf("최대 값은 = %d\n", Max);
        System.out.printf("최소 값은 = %d\n", Min);

    }

}
