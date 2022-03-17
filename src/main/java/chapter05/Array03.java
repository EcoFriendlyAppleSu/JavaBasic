package chapter05;

public class Array03 {
    public static void main(String[] args) {
        int[] ary1 = {1, 2, 3, 4, 5};
        for (int temp : ary1) {
            System.out.printf("%d\t", ary1[temp]);
        }

        //copy 진행
        int[] ary2 = new int[ary1.length * 2];
        for (int i = 0; i < ary1.length; i++) {
            ary2[i] = ary1[i];
        }

        for (int temp : ary2) {
            System.out.printf("%d\t", ary2[temp]);
        }
        System.out.println(ary2);

        char[] abc = {'A', 'B', 'C', 'D', 'E'};
        char[] num = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] result = new char[abc.length + num.length];

        System.arraycopy(abc, 0, result, 0, abc.length);

    }
}
