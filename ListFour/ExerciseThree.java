package ListFour;
import utils.sort.InsertSort;
import utils.interfaces.ArrayListWrapper;
import utils.interfaces.IList;

public class ExerciseThree {
    public static void main(String[] args) {
        IList<Integer> list = new ArrayListWrapper<>();
        list.add(3);
        list.add(76);
        list.add(71);
        list.add(5);
        list.add(57);
        list.add(12);
        list.add(50);
        list.add(20);
        list.add(93);
        list.add(20);
        list.add(4);
        list.add(62);

        InsertSort<Integer> sorter = new InsertSort<Integer>();
        IList<Integer> sortedList = sorter.sort(list);

        System.out.print("Sorted List: ");
        for (Integer num : sortedList) {
            System.out.print(num + " ");
        }
    }
}
