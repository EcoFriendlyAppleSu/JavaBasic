package chapter07_01;

public class GoldMemberDiscount implements DiscountPolicy{

    @Override
    public void discount() {
        System.out.println("Gold Discount Policy class");

    }
}
