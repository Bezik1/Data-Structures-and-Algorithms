package utils.queue;

import utils.lists.TwoWayUnorderedListWithHeadAndTail;

public class ListQueue<E> implements IQueue<E>{
    TwoWayUnorderedListWithHeadAndTail<E> list;

    public ListQueue() {
        list= new TwoWayUnorderedListWithHeadAndTail<E>();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public E dequeue() {
        E value = list.remove(0);
        return value;
    }

    @Override
    public void enqueue(E elem) {
        list.add(elem);
    }

    @Override
    public int size() {
        return list.size();
    }

    public E first() throws EmptyQueueException {
        E value = list.get(0);
        if(value==null) throw new EmptyQueueException();
        return value;
    }
}