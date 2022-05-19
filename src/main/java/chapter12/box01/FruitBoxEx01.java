package chapter12.box01;

import java.util.ArrayList;

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

public class FruitBoxEx01 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();
        Box<Grape> grapeBox = new Box<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // 다형성 가능

        appleBox.add(new Apple());
        // appleBox.add(new Grape()); 부모가 같다해서 다음과 같이 확장시킬 수 없다.
        // appleBox.add(new Toy()); 안된다.
        // toyBox.add(new Grape()); 안된다.
        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}

/**
 * Box<T>객체는 오직 한 가지 종류, T type의 객체만 저장할 수 있다.
 * @param <T>
 */
class Box<T> {
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
