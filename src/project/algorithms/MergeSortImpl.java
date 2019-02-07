package project.algorithms;

public class MergeSortImpl implements Algorithms{
    @Override
    public void sort(int[] arr) {

    }

    @Override
    public void sort(int[] arr, int left, int right) {
        if ((right - left) < 1)
            return;

        int countL = (right + left) / 2 + 1;
        int countR = right - (right + left) / 2;
        int[] arrL = new int[countL];
        int[] arrR = new int[countR];

        for (int i = 0; i < countL; ++i)
            arrL[i] = arr[i + left];
        for (int i = 0; i < countR; ++i)
            arrR[i] = arr[countL + i];

        sort(arrL, left, countL - 1);
        sort(arrR, 0, countR - 1);

        //merge left and right arrays
        int r = 0;
        int l = 0;

        for (int i = left; i < right + 1; ++i) {
            if ((l < countL) && (r < countR)) {
                if (arrL[l] < arrR[r]) {
                    arr[i] = arrL[l];
                    ++l;
                } else {
                    arr[i] = arrR[r];
                    ++r;
                }
            } else {
                if (l < countL) {
                    arr[i] = arrL[l];
                    ++l;
                }
                if (r < countR) {
                    arr[i] = arrR[r];
                    ++r;
                }
            }
        }

    }
}
