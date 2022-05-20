package chapter12_Generics.school;

import java.util.ArrayList;

public class Person<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void add(T member) {
        this.list.add(member);
    }

    public ArrayList<T> getList() {
        return this.list;
    }

    @Override
    public String toString() {
        return this.list.toString();
    }
}
