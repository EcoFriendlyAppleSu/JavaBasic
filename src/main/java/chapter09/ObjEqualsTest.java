package chapter09;

import chapter09.exceptionPkg.MyException;

public class ObjEqualsTest {
    public static void main(String[] args) throws MyException {
        Value v1 = new Value(20);
        Value v2 = new Value(20);

        if (!v1.equals(v2)) {
            System.out.println("ho");
            throw new MyException("같은 객체가 아닙니다.");
        } else {
            System.out.println("v1 과 v2는 같은 객체입니다.");
        }

    }
}
