package utils.sort;

import java.util.Iterator;

import utils.interfaces.IList;
import utils.interfaces.ListSorter;
import utils.lists.TwoWayUnorderedListWithHeadAndTail;
import utils.queue.ListQueue;

public class MergeSort<T extends Comparable<T>> implements ListSorter<T> {
    public ListQueue<IList<T>> listQueue = new ListQueue<IList<T>>();
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public IList<T> sort(IList<T> list) {
        Iterator initialIter = list.iterator();
        while(initialIter.hasNext()) {
            T element = (T) initialIter.next();

            TwoWayUnorderedListWithHeadAndTail elementList = new TwoWayUnorderedListWithHeadAndTail<>();
            elementList.add(element);

            listQueue.enqueue(elementList);
        }

        while(listQueue.size() != 1) {
            TwoWayUnorderedListWithHeadAndTail firstEl = (TwoWayUnorderedListWithHeadAndTail<T>) listQueue.dequeue();
            TwoWayUnorderedListWithHeadAndTail secondEl = null;
            if(!listQueue.isEmpty()) {
                secondEl = (TwoWayUnorderedListWithHeadAndTail<T>) listQueue.dequeue();
            }

            IList<T> toEnqueue = null;
            if(secondEl != null) toEnqueue = merge(firstEl, secondEl);
            else toEnqueue = firstEl;

            listQueue.enqueue(toEnqueue);
        }
        return listQueue.dequeue();
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private IList<T> merge(IList<T> left, IList<T> right) {
        TwoWayUnorderedListWithHeadAndTail<T> res = new TwoWayUnorderedListWithHeadAndTail<>();
    
        Iterator firstIter = left.iterator();
        Iterator secondIter = right.iterator();
    
        T firstEl = firstIter.hasNext() ? (T) firstIter.next() : null;
        T secondEl = secondIter.hasNext() ? (T) secondIter.next() : null;
    
        while (firstEl != null && secondEl != null) {
            if (firstEl.compareTo(secondEl) <= 0) {
                res.add(firstEl);
                firstEl = firstIter.hasNext() ? (T) firstIter.next() : null;
            } else {
                res.add(secondEl);
                secondEl = secondIter.hasNext() ? (T) secondIter.next() : null;
            }
        }
    
        while (firstEl != null) {
            res.add(firstEl);
            firstEl = firstIter.hasNext() ? (T) firstIter.next() : null;
        }
    
        while (secondEl != null) {
            res.add(secondEl);
            secondEl = secondIter.hasNext() ? (T) secondIter.next() : null;
        }
    
        return res;
    }
}
