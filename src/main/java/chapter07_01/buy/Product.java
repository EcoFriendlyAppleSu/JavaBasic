package chapter07_01.buy;

public class Product {
    private int price;
    private int bonusPoint;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }
}
