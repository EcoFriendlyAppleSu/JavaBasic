package chapter06;

public class DocumentTest {
    static int count = 0;
    String name;

    public DocumentTest() {
        this("제목 없음" + ++count);
    }

    public DocumentTest(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다.");
    }

    public static void main(String[] args) {
        DocumentTest dt1 = new DocumentTest();
        DocumentTest dt2 = new DocumentTest();
        DocumentTest dt3 = new DocumentTest("kim");
        DocumentTest dt4 = new DocumentTest();
    }
}
