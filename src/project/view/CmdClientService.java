package project.view;

import project.App;
import project.algorithms.Algorithms;
import project.algorithms.SelectionSortImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdClientService {
    private String[] menuItems = {"1. Selection sort", "0. Exit"};
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private Algorithms algorithm;

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

            while (!(response=input.readLine()).equals("0")){
                if ("1".equals(response)) {
                    System.out.println("Array before: ");
                    printArray(App.arr);
                    algorithm = new SelectionSortImpl();
                    algorithm.sort(App.arr);
                    System.out.println("\nSorted array: ");
                    printArray(App.arr);
                    break;

                } else {
                    System.out.println("Please enter correct number");
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.exit(0);
    }

private static void printArray(int[] arr){
    for(int i=0; i < arr.length; ++i){
        System.out.print(arr[i]+" ");
    }
}




}
