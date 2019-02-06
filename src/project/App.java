package project;


import project.view.CmdClientService;

public class App {

    public static int[] arr = {1, 3, -4 , 6, 0, 2};
    public static void main(String[] args) {
        CmdClientService cmd = new CmdClientService();
        cmd.showMenuItems();
        cmd.getUserResponse();
    }



}
