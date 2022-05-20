package chapter12_Generics.box03;

/**
 * FruitBox는 Fruit type의 클래스를 <>안에 사용 가능하고
 * Juice는 FruitBox안에 담긴 것을 확장시켜 사용한다.
 */
public class FruitBoxEx03 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        // fruitBox -> FruitBox<? extends Fruit> box -> fruit와 관련된 것들이 올 수 있다.
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(fruitBox.get(1));
        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}
