package ListFour;
import utils.sort.BubbleSort;
import utils.interfaces.ArrayListWrapper;
import utils.interfaces.IList;

public class ExerciseFive {
    public static void main(String[] args) {
        IList<Integer> list = new ArrayListWrapper<>();
        list.add(76);
        list.add(20);
        list.add(5);
        list.add(57);
        list.add(12);
        list.add(50);
        list.add(20);
        list.add(93);
        list.add(44);
        list.add(55);
        list.add(62);
        list.add(3);

        BubbleSort<Integer> sorter = new BubbleSort<Integer>();
        IList<Integer> sortedList = sorter.sort(list);

        System.out.print("Sorted List: ");
        for (Integer num : sortedList) {
            System.out.print(num + " ");
        }
    }
}
