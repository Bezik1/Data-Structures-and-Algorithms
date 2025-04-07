package utils.sort;

import utils.interfaces.IList;
import utils.interfaces.ListSorter;

public class HeapSort<T extends Comparable<T>> implements ListSorter<T> {
    public IList<T> sort(IList<T> list) {
        heapsort(list, list.size());
        return list;
    }

    private void heapsort(IList<T> list, int n) {
        createHeap(list, n);
        for(int i=n-1; i>0; i--) {
            swap(list, i, 0);
            repair(list, 0, i);
            printList(list, n-i-1);
        }
    }

    private void swap(IList<T> list, int left, int right) {
        T temp = list.get(left);
        list.set(left, list.get(right));
        list.set(right, temp);
    }

    public void repair(IList<T> heap, int i, int n) {
        int idxOfChildrenOne=2*i+1;
        int idxOfChildrenTwo=2*i+2;

        if(idxOfChildrenOne<n) {
            if(idxOfChildrenTwo<n && heap.get(idxOfChildrenOne).compareTo(heap.get(idxOfChildrenTwo)) < 0) {
                idxOfChildrenOne++;
            }

            if(heap.get(i).compareTo(heap.get(idxOfChildrenOne)) < 0) {
                swap(heap,i, idxOfChildrenOne);
                repair(heap, idxOfChildrenOne, n);
            }
        }
    }

    public void createHeap(IList<T> list, int n) {
        for(int i=(n-1)/2;i>=0;i--) {
            repair(list, i, n);
        }
    }

    private void printList(IList<T> list, int iteration) {
        System.out.print("Iteration: " + iteration + " | List: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
