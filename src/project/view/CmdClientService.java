package project.view;

import project.App;
import project.algorithms.Algorithms;
import project.algorithms.InsertionSortImpl;
import project.algorithms.SelectionSortImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdClientService {
    private String[] menuItems = {"1. Selection sort", "2. Insertion sort", "0. Exit"};
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    //private Algorithms algorithm;

    public void showMenuItems(){
        System.out.println(" Menu:");
        for (String item: menuItems) {
            System.out.println("|------------------------|");
            System.out.println(" "+item);
        }
        System.out.println("|________________________|");
    }

    public void getUserResponse() {
        System.out.print("Please enter number of menu item => ");
        String response;
        try{
            int item = -1;
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
    algorithm = new SelectionSortImpl();
    int[] cloneArray = App.arr.clone();
    algorithm.sort(cloneArray);
    System.out.println("\nSorted array: ");
    printArray(cloneArray);
}
private void printArray(int[] arr){
    for(int i=0; i < arr.length; ++i){
        System.out.print(arr[i]+" ");
    }
}




}
