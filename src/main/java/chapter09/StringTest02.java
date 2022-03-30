package chapter09;

public class StringTest02 {
    public static void main(String[] args) {
        int val = 100;
        String strval = String.valueOf(val);
        System.out.println("strval = " + strval);

        System.out.printf("type is %d", Integer.parseInt(strval.trim()));
    }
}
