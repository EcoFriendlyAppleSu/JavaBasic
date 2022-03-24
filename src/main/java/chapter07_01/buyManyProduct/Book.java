package chapter07_01.buyManyProduct;

public class Book extends ProductInfo {

    private Book() {
        super(100);
    }

    public static Book getBookInstance() { // 호출 시 메모리에 올라가 getInstance할 수 있다.
        return new Book();
    }

    public String toString() {
        return "Book";
    }
}
