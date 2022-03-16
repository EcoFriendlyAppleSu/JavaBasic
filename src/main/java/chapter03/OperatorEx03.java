package chapter03;

public class OperatorEx03 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("str1 == \"abc?\"?, result = %b\n", str1 == "abc");
        System.out.printf("str2 == \"abc?\"?, result = %b\n", str2 == "abc");
        System.out.printf("str2 == \"abc?\"(Using equal())?, result = %b\n", str2.equals("abc"));
        System.out.printf("str1 == str2 ?, result = %b\n", str1 == str2); // str1 != str2

    }
}
