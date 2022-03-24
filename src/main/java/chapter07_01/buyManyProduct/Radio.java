package chapter07_01.buyManyProduct;

public class Radio extends ProductInfo {

    private Radio() {
        super(250);
    }

    public static Radio getRadioInstance() {
        return new Radio();
    }

    public String toString() {
        return "Radio";
    }
}
