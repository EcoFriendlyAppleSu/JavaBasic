package chapter06;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strAry = {"100", "200", "300"};

        // Ambiguous method call. Both error 발생
        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("0", strAry));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for (String str :
                args) {
            result += str + delim;
        }
        return result;
    }

    /*static String concatenate(String... args) {
        return concatenate("", args);
    }*/
}
