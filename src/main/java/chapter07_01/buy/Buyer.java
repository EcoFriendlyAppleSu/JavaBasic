package chapter07_01.buy;

public class Buyer {
    public static int hasMoney = 1000; // final을 붙이면 상수취급.
    public static int bonusPoint = 0;

    public void buy(Product product) { // 매개변수의 다형성으로 구현
        if (hasMoney < product.getPrice()) {
            System.out.println("현금이 부족해 제품을 구매하실 수 없습니다.");
            return;
        }

        hasMoney -= product.getPrice();
        bonusPoint = product.getBonusPoint();
        System.out.println(product + "를 구매하셨습니다.");
        product.toString();
    }
}
