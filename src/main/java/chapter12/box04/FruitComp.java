package chapter12.box04;

import java.util.Comparator;

public class FruitComp implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o2.getWeight() - o1.getWeight();
    }

}
