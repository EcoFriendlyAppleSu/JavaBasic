package chapter08;

public class NewExceptionTest {
    public static void main(String[] args) throws MemoryException, SpaceException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException sp) {
            System.out.println("예외 처리 메세지 : " + sp.getMessage());
            sp.printStackTrace();
            System.out.println("설치할 공간을 확보해 주세요");
        } catch (MemoryException me) {
            System.out.println("예외 처리 메세지 : " + me.getMessage());
            me.printStackTrace();
            System.out.println("메모리가 부족합니다.");
        } finally {
            deleteTempFiles();
        }

    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if (!enoughSpace()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }
    static void copyFiles() {
        return;
    }
    static void deleteTempFiles() {
        System.out.println("Temp File Delete");
    }
    static boolean enoughSpace() {
        return false;
    }
    static boolean enoughMemory() {
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
