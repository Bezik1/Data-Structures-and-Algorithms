package ListFive;

import java.util.Random;

import utils.interfaces.IList;
import utils.lists.TwoWayUnorderedListWithHeadAndTail;
import utils.sort.QuickSort;

public class ExerciseFive {
    public static void main(String[] args) {
        IList<Integer> list = new TwoWayUnorderedListWithHeadAndTail<Integer>();

        Random rand = new Random();
        for(int i=0; i<200; i++) list.add(rand.nextInt(100));

        QuickSort<Integer> sorter = new QuickSort<Integer>();
        IList<Integer> sortedList = sorter.sort(list);
    
        System.out.print("Sorted List: ");
        for (Integer num : sortedList) {
            System.out.print(num + " ");
        }
    }
}
