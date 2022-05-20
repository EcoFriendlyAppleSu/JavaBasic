package chapter12_Generics.box04;

import java.util.Comparator;

public class PeachComp implements Comparator<Peach> {
    @Override
    public int compare(Peach o1,Peach o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
