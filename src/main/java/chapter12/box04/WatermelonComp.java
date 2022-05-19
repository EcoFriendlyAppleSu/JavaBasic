package chapter12.box04;

import java.util.Comparator;

public class WatermelonComp implements Comparator<Watermelon> {
    @Override
    public int compare(Watermelon o1, Watermelon o2) {
        return o1.getWeight() - o2.getWeight();
    }

}
