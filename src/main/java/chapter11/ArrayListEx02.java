package chapter11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx02 implements List {
    Object[] objects = null;
    int capacity = 0;
    int size = 0;

    public ArrayListEx02(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("유효하지 않는 값입니다. :" + capacity);
        }
        this.capacity = capacity;
        objects = new Object[capacity]; // object 생성
    }

    public ArrayListEx02() {
        this(10);
    }

    // 최소한의 저장공간을 확보하는 메서드
    public void ensureCapacity(int minCapacity) {
        if (minCapacity - objects.length > 0) {
            setCapacity(minCapacity);
        }
    }

    public boolean add(Object obj) {
        ensureCapacity(size + 1);
        objects[size++] = obj;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        return objects[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        Object oldObj = null;

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        oldObj = objects[index];

        if (index != size-1) {
            System.arraycopy(objects, index+1, objects, index, size - index - 1);
        }
        objects[size - 1] = null;
        size--;
        return oldObj;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public void setCapacity(int minCapacity) {
        if (this.capacity == minCapacity) {
            return;
        }
        Object[] tmp = new Object[minCapacity];
        System.arraycopy(objects, 0, tmp, 0, size);
        objects = tmp;
        this.capacity = capacity;
    }

    public void trimToSize() {
        setCapacity(size);
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            objects[i] = null;
        }
        this.size = 0;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(objects, 0, result, 0, size);
        return result;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    public int capacity() {
        return capacity;
    }
    public int size() {
        return size;
    }

}
