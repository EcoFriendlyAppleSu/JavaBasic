package chapter09;

public class StringTest03 {
    public static void main(String[] args) {
        String fullName = "hello.java";

        int index = fullName.indexOf('.');

        String fileName = fullName.substring(0, index);
        System.out.println("fileName = " + fileName);

        String ext = fullName.substring(index + 1);
        System.out.println("ext = " + ext);

        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str2.equals(str1));
        System.out.println(str3.equals(str2)); // 객체가 갖고 있는 값은 같아요
        System.out.println(str3 == str2); // 객체 주소값은 틀려요

    }
}
