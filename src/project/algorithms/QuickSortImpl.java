package project.algorithms;

public class QuickSortImpl implements Algorithms {

    public void sort (int arr[], int start, int stop) {
        if (stop == 0)
            return;
        if (start >= stop)
            return;

        int ind = start;
        for (int i = start + 1; i < stop; ++i) {
            if (arr[i] < arr[ind]) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                ind = i;
            }
        }
        sort(arr, start, ind);
        sort(arr, ind + 1, arr.length);
    }

    @Override
    public void sort(int[] arr) {

    }
}
