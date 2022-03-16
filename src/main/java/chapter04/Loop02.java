package chapter04;

public class Loop02 {
    public static void main(String[] args) {

        int[] ary = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("--- same result ---");

        for (int temp : ary) {
            System.out.println("temp = " + temp);
        }
    }
}
