package chapter09;

import java.util.Random;

public class RandomEx01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[100];
        int[] count = new int[10];

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] = random.nextInt(10));
        }

        for (int i = 0; i < number.length; i++) {
            count[number[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "의 개수 :" + printGraph('#', count[i]) + " " + count[i]);

        }
    }

    public static String printGraph(char ch, int val) {
        char[] bar = new char[val];
        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch;
        }
        return new String(bar);
    }
}
