package project.algorithms;

public class BinarySearch {

    public int binarySearch(int[]arr, int element){
        boolean flag = false;
        for(int i = 0; i< arr.length; ++i){
            if(arr[i] == element){
                flag = true;
                break;
            }
        }
        if(flag) {
            int ind = arr.length / 2;
            while (element != arr[ind]) {
                if (element < arr[ind])
                    ind = ind / 2;
                else
                    ind = (arr.length + ind) / 2;
            }
            return ind;
        }
        else {
            System.out.println("there are no such elemrnts in array");
            return -1;
        }
    }
}
