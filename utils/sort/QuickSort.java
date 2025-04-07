package utils.sort;

import java.util.Random;

import utils.interfaces.IList;
import utils.interfaces.ListSorter;

public class QuickSort<T extends Comparable<T>> implements ListSorter<T> {
    public IList<T> sort(IList<T> list) {
        quicksort(list, 0, list.size()-1);
        return list;
    }

    private void quicksort(IList<T> list, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return;
        int partition = partition(list, startIndex, endIndex);
        quicksort(list, startIndex, partition-1);
        quicksort(list, partition + 1, endIndex);
    }

    private int partition(IList<T> list, int nFrom, int nTo) {
        int pivot = selectPivot(list, nFrom, nTo);
        swap(list, nFrom, pivot);
        T value = list.get(nFrom);
        int idxBigger = nFrom + 1;
        int idxLower = nTo;
    
        while (true) {
            while (idxBigger <= idxLower && list.get(idxBigger).compareTo(value) <= 0) idxBigger++;
            while (idxBigger <= idxLower && list.get(idxLower).compareTo(value) > 0) idxLower--;
    
            if (idxBigger >= idxLower) break;
            swap(list, idxBigger, idxLower);
        }
    
        swap(list, nFrom, idxLower);
        return idxLower;
    }

    private int selectPivot(IList<T> list, int nFrom, int nTo) {
        int elementsCount = nTo - nFrom;
        
        Random rand = new Random();
        if(elementsCount > 100) {
            System.out.println("Used three elements based pivot!");
            int randOne = rand.nextInt(nFrom, nTo);
            int randTwo = rand.nextInt(nFrom, nTo);
            int randThree = rand.nextInt(nFrom, nTo);
            
            if((randOne > randTwo && randOne < randThree) || (randOne < randTwo && randOne > randThree)) return randOne;
            if((randTwo > randOne && randTwo < randThree) || (randTwo < randOne && randTwo > randThree) ) return randTwo;
            else return randThree;
        } else return rand.nextInt(nFrom, nTo);
    }

    private void swap(IList<T> list, int leftIndex, int rightIndex) {
        if(leftIndex == rightIndex) return;
        T temp = list.get(leftIndex);
        list.set(leftIndex, list.get(rightIndex));
        list.set(rightIndex, temp);
    }
}
