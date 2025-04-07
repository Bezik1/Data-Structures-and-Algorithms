package utils.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListWrapper<T> implements IList<T> {
    private ArrayList<T> list;

    public ArrayListWrapper() {
        list = new ArrayList<>();
    }

    public boolean add(T e) { return list.add(e); }
    public void add(int index, T e) { list.add(index, e); }
    public void clear() { list.clear(); }
    public boolean contains(T e) { return list.contains(e); }
    public T get(int index) { return list.get(index); }
    public T set(int index, T e) { return list.set(index, e); }
    public int indexOf(T e) { return list.indexOf(e); }
    public boolean isEmpty() { return list.isEmpty(); }
    public Iterator<T> iterator() { return list.iterator(); }
    public ListIterator<T> listIterator() { return list.listIterator(); }
    public T remove(int index) { return list.remove(index); }
    public boolean remove(T e) { return list.remove(e); }
    public int size() { return list.size(); }
}
