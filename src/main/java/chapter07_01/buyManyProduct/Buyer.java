package chapter07_01.buyManyProduct;

public class Buyer {
    public static int hasMoney = 10000;
    public static int bonusPoint = 0;
    private ProductInfo[] item = new ProductInfo[10];
    int count = 0;

    public void buy(ProductInfo product) { // ProdectInfo product = Book.getInstance();
        if (hasMoney < product.getPrice()) {
            System.out.println("보유하신 금액이 부족합니다.");
            return;
        }
        hasMoney -= product.getPrice();
        bonusPoint += product.getBonusPoint();
        item[count++] = product;

        // let customer know
        System.out.println(product + "를 구매하셨습니다."); // product == product.toString()
    }

    public void summary() {
        int resultPrice = 0;
        String itemList = "";

        /*for (ProductInfo result : item) {
            resultPrice += result.getPrice();
            itemList += result.toString() + ", ";
        }*/

        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                break;
            }
            resultPrice += item[i].getPrice();
            itemList += item[i].toString() + ", ";
        }

        System.out.println("구입하신 물품의 총 가격은 " + resultPrice + " 입니다.");
        System.out.println("구입하신 물품은 " + itemList + " 입니다.");

    }
}
