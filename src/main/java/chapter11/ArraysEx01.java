package chapter11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysEx01 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};

        System.out.println("1D ary = " + Arrays.toString(arr));
        System.out.println("2D ary = " + Arrays.deepToString(arr2D));

        int[] ary2 = Arrays.copyOf(arr, arr.length);
        int[] ary3 = Arrays.copyOf(arr, 3);
        int[] ary4 = Arrays.copyOf(arr, 7);
        int[] ary5 = Arrays.copyOfRange(arr, 2, 4);
        int[] ary6 = Arrays.copyOfRange(arr, 0, 7);

        System.out.println("ary2 = " + Arrays.toString(ary2));
        System.out.println("ary3 = " + Arrays.toString(ary3));
        System.out.println("ary4 = " + Arrays.toString(ary4));
        System.out.println("ary5 = " + Arrays.toString(ary5));
        System.out.println("ary6 = " + Arrays.toString(ary6));

        int[] ary7 = new int[5];
        Arrays.fill(ary7, 9);
        System.out.println("ary7 = " + Arrays.toString(ary7));

        Arrays.setAll(ary7, i -> (int) (Math.random() * 5));
        System.out.println("ary7 = " + Arrays.toString(ary7));

        for (int i :
                ary7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i); // char type to String
        }

        String[][] str2D = {{"aaa", "bbb"}, {"ccc", "ddd"}};
        String[][] str2D2 = {{"aaa", "bbb"}, {"ccc", "ddd"}};

        System.out.println(Arrays.deepEquals(str2D, str2D2));

        char[] chArr = {'a', 'd', 'c', 'b', 'e'};
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("index of B = " + Arrays.binarySearch(chArr, 'b'));
        System.out.println("=== Sorting ===");
        Arrays.sort(chArr);
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("index of B = " + Arrays.binarySearch(chArr, 'b'));

    }
}
