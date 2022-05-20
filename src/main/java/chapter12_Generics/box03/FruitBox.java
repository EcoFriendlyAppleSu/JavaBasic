package chapter12_Generics.box03;

/**
 * Fruit 를 상속 받은 객체만 제한적으로 사용할 수 있다.
 * And, Box<T>를 상속받아 Box Class 안에 존재하는 메서드 맴버 변수에 접근할 수 있다.
 * @param <T>
 */
public class FruitBox<T extends Fruit> extends Box<T> {

}
