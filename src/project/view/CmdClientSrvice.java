package project.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdClientSrvice {
    private String[] menuItems = {"0. Exit"};
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public void showMenuItems(){
        System.out.println(" Menu:");
        for (String item: menuItems) {
            System.out.println("|------------------------|");
            System.out.println(" "+item);
        }
        System.out.println("|________________________|");
    }

    public void getResponse() {
        System.out.print("Please enter number of menu item => ");
        try{
            String response;
            while (!(response=input.readLine()).equals("0")){
                System.out.println("Please enter correct number");
                }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.exit(0);
    }


}
