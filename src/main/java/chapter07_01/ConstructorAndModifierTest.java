package chapter07_01;

public class ConstructorAndModifierTest {
    public static void main(String[] args) {
        // TestObject.of();
        TestObject.some(3, 4);
    }
}

class TestObject {
    private int x;
    private int y;

    private TestObject() {
        System.out.println("call private testObject");
    }

    private TestObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static TestObject some(int x, int y) {
        return new TestObject(x, y);
    }

    /*public static TestObject of() {
        return new TestObject();
    }*/
}
