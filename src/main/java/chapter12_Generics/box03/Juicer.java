package chapter12_Generics.box03;

public class Juicer {

    /**
     * Fruit에서 상속받은 클래스들의 type을 사용해도 가능하다.
     */
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String temp = "";

        for (Fruit f : box.getList())
            temp += f + " "; // 과일이 추가가 되는 시점
        return new Juice(temp);
    }
}