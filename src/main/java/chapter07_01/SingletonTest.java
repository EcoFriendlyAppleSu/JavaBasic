package chapter07_01;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }
}

class Singleton {
    private static Singleton s = new Singleton();

    public static Singleton getInstance() {
        if (s == null)
            s = new Singleton();
        return s;
    }
}