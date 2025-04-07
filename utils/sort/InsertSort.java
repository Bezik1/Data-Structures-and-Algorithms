package utils.sort;

import utils.interfaces.IList;
import utils.interfaces.ListSorter;

public class InsertSort<T extends Comparable<T>> implements ListSorter<T> {
    public InsertSort() {}
    public IList<T> sort(IList<T> list) {
        for (int i = 1; i < list.size(); i++) {
            T value = list.get(i),temp;
            int j;
            for (j = i; j > 0 && value.compareTo(temp=list.get(j - 1))>0; --j)
                list.set(j,temp);
            list.set(j, value);
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
}