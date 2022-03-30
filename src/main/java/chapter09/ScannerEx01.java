package chapter09;

import java.util.Scanner;

public class ScannerEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);

        String[] result = str.split(",".trim());

        int x = 0;

        for (int i = 0; i < result.length; i++) {
            x += Integer.valueOf(result[i]);
        }

        System.out.println("x = " + x);
    }
}