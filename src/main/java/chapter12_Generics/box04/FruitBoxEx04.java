package chapter12_Generics.box04;

import java.util.Collections;

public class FruitBoxEx04 {
    public static void main(String[] args) {
        FruitBox<Peach> peachBox = new FruitBox<>();
        FruitBox<Watermelon> watermelonBox = new FruitBox<>();

        peachBox.add(new Peach("RedPeach", 300));
        peachBox.add(new Peach("RedPeach", 100));
        peachBox.add(new Peach("RedPeach", 200));

        watermelonBox.add(new Watermelon("GreenWatermelon", 400));
        watermelonBox.add(new Watermelon("GreenWatermelon", 300));
        watermelonBox.add(new Watermelon("GreenWatermelon", 200));

        /**
         * comparator를 사용해 비교할 거리를 세팅한다.
         * 와일드 카드가 사용되어 Fruit에서 확장된 클래스들을 사용할 수 있도록 제공한다.
         */
        Collections.sort(peachBox.getList(), new PeachComp());
        Collections.sort(watermelonBox.getList(), new WatermelonComp());

        System.out.println(peachBox);
        System.out.println(watermelonBox);

        Collections.sort(peachBox.getList(), new FruitComp());
        Collections.sort(watermelonBox.getList(), new FruitComp());

        System.out.println(peachBox);
        System.out.println(watermelonBox);



    }
}
