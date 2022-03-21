package chapter06;

public class ClassTest {
    public static void main(String[] args) {
        long A = 100L;
        long B = 88L;

        System.out.println(MathTest.staticAdd(A, B));
        System.out.println(MathTest.staticMinus(A, B));
        System.out.println(MathTest.staticMulti(A, B));
        System.out.println(MathTest.staticDivide(A, B));

        MathTest mathTest = new MathTest();
        mathTest.a = 50L;
        mathTest.b = 11L;

        System.out.println(mathTest.add());
        System.out.println(mathTest.minus());
        System.out.println(mathTest.multi());
        System.out.println(mathTest.divide());
    }
}

class MathTest {
    public long a;
    public long b;

    public long add() { return a + b; }
    public long minus() { return a - b; }
    public long multi() { return a * b; }
    public long divide() { return a / b; }


    static long staticAdd(long a, long b) {
        return a + b;
    }

    static long staticMinus(long a, long b) {
        return a - b;
    }

    static long staticMulti(long a, long b) {
        return a * b;
    }
    static long staticDivide(long a, long b) {
        return a / b;
    }


}
