package utils.sort;

public class CountingSort{

    //@SuppressWarnings({ "unchecked", "rawtypes" })
    public int[] sort(int[]list, int n, int k) {
        k++;
        int[] pos = new int[k];
        int result[] = new int[n];

        for(int i=0; i<k; i++) {
            pos[i] = 0;
        }

        for(int i=0; i<n; i++) {
            pos[list[i]] += 1;
        }
        return result;
    }
}
