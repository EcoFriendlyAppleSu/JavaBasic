package chapter07_01;

public class NormalMemberDiscount implements DiscountPolicy{

    @Override
    public void discount() {
        System.out.println("Normal Discount Policy class");
    }
}
