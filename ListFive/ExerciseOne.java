package ListFive;

import utils.interfaces.IList;
import utils.lists.TwoWayUnorderedListWithHeadAndTail;
import utils.sort.MergeSort;

public class ExerciseOne {
    public static void main(String[] args) {
        IList<Integer> list = new TwoWayUnorderedListWithHeadAndTail<Integer>();
        list.add(76);
        list.add(71);
        list.add(5);
        list.add(57);
        list.add(12);
        list.add(50);
        list.add(20);
        list.add(93);
        list.add(20);
        list.add(55);
        list.add(62);
        list.add(3);

        MergeSort<Integer> sorter = new MergeSort<Integer>();
        IList<Integer> sortedList = sorter.sort(list);
    
        System.out.print("Sorted List: ");
        for (Integer num : sortedList) {
            System.out.print(num + " ");
        }
    }
}
