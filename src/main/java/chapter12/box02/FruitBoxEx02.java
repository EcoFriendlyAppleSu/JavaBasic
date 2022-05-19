package chapter12.box02;

import java.util.ArrayList;

class FruitEx2 implements Eatable {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class AppleEx2 extends FruitEx2 {
    @Override
    public String toString() {
        return "Apple";
    }
}

class GrapeEx2 extends FruitEx2 {
    @Override
    public String toString() {
        return "Grape";
    }
}

class ToyEx2 {
    @Override
    public String toString() {
        return "Toy";
    }
}

/**
 * 제한된 Generics class
 */
public class FruitBoxEx02 {
    public static void main(String[] args) {
        FruitBox<FruitEx2> fruitBox = new FruitBox<>();
        FruitBox<AppleEx2> appleBox = new FruitBox<>();
        FruitBox<GrapeEx2> grapeBox = new FruitBox<>();
        FruitBox<GrapeEx2> grapeBox2 = new FruitBox<>();
        // FruitBox<ToyEx2> toyBox = new FruitBox<>();

        fruitBox.add(new FruitEx2());
        fruitBox.add(new AppleEx2());
        fruitBox.add(new GrapeEx2());
        appleBox.add(new AppleEx2());
        grapeBox.add(new GrapeEx2());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);

    }
}

/**
 * FruitBox는 Basket을 상속받아 맴버 변수와 매서드를 사용할 수 있으며,
 * 와일드 카드로 제한된
 * @param <T>
 */
class FruitBox<T extends FruitEx2 & Eatable> extends Basket<T> {
}

class Basket<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item){
        list.add(item);
    }
    T get(int i) {
        return list.get(i);
    }
    int size() {
        return list.size();
    }
    @Override
    public String toString() {
        return list.toString();
    }

}
