package Chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "100";
        System.out.print("Write Down one Digit: ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("Number :" + input); // input은 String type
        System.out.printf("num = %d\n", num);
        System.out.printf("String a parseInt result is : %s", Integer.parseInt(a));
    }
}
