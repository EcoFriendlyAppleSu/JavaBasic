package chapter05;

public class Array09 {
    public static void main(String[] args) {
        String str = "abcde";

        // String to char
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.printf("ch[%d] = %c\n", i, ch);
        }

        char[] chAry = str.toCharArray();
        for (char temp :
                chAry) {
            System.out.println("temp = " + temp);
        }
    }
}
