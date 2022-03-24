package chapter07_01.buyManyProduct;

public class MacBook extends ProductInfo{
     private MacBook() {
        super(500);
    }

    public static MacBook getMacBookInstance() {
        return new MacBook();
    }

    public String toString() {
        return "MacBook";
    }
}
