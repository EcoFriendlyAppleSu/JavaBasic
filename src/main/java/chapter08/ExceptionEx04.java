package chapter08;

public class ExceptionEx04 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("Exception Test");
            throw e;
            // throw new Exception("Exception Test"); 로 축약 가능
        } catch (Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
