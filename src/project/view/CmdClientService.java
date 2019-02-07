package project.view;

import project.App;
import project.algorithms.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdClientService {
    private static String[] menuItems = {"1. Selection sort", "2. Insertion sort", "3. Bubble sort", "4. Quick sort", "5. Merge sort", "7. Show menu","0. Exit"};
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    private static void showMenuItems(){
        System.out.println(" Menu:");
        for (String item: menuItems) {
            System.out.println("|------------------------|");
            System.out.println(" "+item);
        }
        System.out.println("|________________________|");
        System.out.print("Please enter number of menu item => ");

    }

    public void getUserResponse() {
        showMenuItems();
        String response;
        try{
            int item = 0;
            while (!(response=input.readLine()).equals("0")){
                try{
                    item = new Integer(response);
                }catch (NumberFormatException e){
                    System.out.println("Please enter number value!");
                }
                switch (item){
                    case 1:
                        performSort(new SelectionSortImpl());
                        break;
                    case 2:
                        performSort(new InsertionSortImpl());
                        break;
                    case 3:
                        performSort(new BubbleSortImpl());
                        break;
                    case 4:
                        performSort(new QuickSortImpl());
                        break;
                    case 5:
                        performSort(new MergeSortImpl());
                        break;
                    case 7:
                        showMenuItems();
                        break;
                    default:
                        System.out.println("Please enter correct number");
                        break;
                }
                System.out.print("\n\nPlease enter number of menu item => ");
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        System.exit(0);
    }

private void performSort(Algorithms algorithm){
    System.out.println("Array before: ");
    printArray(App.arr);
    int[] cloneArray = App.arr.clone();
    if (algorithm instanceof QuickSortImpl){
        algorithm.sort(cloneArray, 0, cloneArray.length);
    }
    if(algorithm instanceof MergeSortImpl){
        algorithm.sort(cloneArray, 0, cloneArray.length-1);
    }
    else {
        algorithm.sort(cloneArray);
    }
    System.out.println("\nSorted array: ");
    printArray(cloneArray);
}
private void printArray(int[] arr){
    for(int i=0; i < arr.length; ++i){
        System.out.print(arr[i]+" ");
    }
}




}
