import com.sun.source.tree.Tree;

import java.util.*;

public class testFile implements Cloneable {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        ArrayList<TreeSet> temp = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; treeSet.size() < 6; j++) {
                treeSet.add(Integer.valueOf(random.nextInt(45) + 1));
            }
            System.out.println(treeSet);
            temp.add(treeSet);
            treeSet.clear();
        }
        System.out.println(temp);

    }
}
