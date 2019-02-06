package project;


import project.view.CmdClientSrvice;

public class App {

    public static void main(String[] args) {
        CmdClientSrvice cmd = new CmdClientSrvice();
        cmd.showMenuItems();
        cmd.getResponse();
    }



}
