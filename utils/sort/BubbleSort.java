package utils.sort;

import utils.interfaces.IList;
import utils.interfaces.ListSorter;

public class BubbleSort<T extends Comparable<T>> implements ListSorter<T> {
    public IList<T> sort(IList<T> list) {
        for(int i=0; i<list.size(); i++) {
            for(int j=0; j<list.size()-i-1; j++) {
                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    swap(list, j, j+1);
                }
            }
            printList(list, i);
        }

        return list;
    }

    private void printList(IList<T> list, int iteration) {
        System.out.print("Iteration: " + iteration + " | List: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    private void swap(IList<T> list, int left, int right) {
        T temp = list.get(left);
        list.set(left, list.get(right));
        list.set(right, temp);
    }
}
