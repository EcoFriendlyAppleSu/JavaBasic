package chapter12_Generics.box03;

import java.util.ArrayList;

public class Box<T> {
    public ArrayList<T> list = new ArrayList<>();

    public void add(T item) {
        this.list.add(item);
    }

    public T get(int i) {
        return this.list.get(i);
    }

    public ArrayList<T> getList() {
        return this.list;
    }

    public int size() {
        return this.list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
