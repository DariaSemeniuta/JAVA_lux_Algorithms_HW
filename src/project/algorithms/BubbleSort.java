package project.algorithms;

public class BubbleSort implements Algorithms {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            for (int j = n - 1; j > i; --j) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    @Override
    public void sort(int[] arr, int start, int stop) {

    }
}
