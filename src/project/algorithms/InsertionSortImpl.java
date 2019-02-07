package project.algorithms;

public class InsertionSortImpl implements Algorithms{

    @Override
    public void sort(int[] arr) {
        for(int i=1; i<arr.length; ++i){
            for(int j=0; j<i; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    @Override
    public void sort(int[] arr, int start, int stop) {

    }
}
