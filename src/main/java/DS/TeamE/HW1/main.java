package main.java.DS.TeamE.HW1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Put in an INTEGER id for your first group of devices");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.println("Put in an INTEGER id for your first device in the group");
        int iddev = scan.nextInt();
        scan.nextLine();


        List<SmartDevice> basegrouplist = (new ArrayList<SmartDevice>( Arrays.asList(new SmartDevice("LED light", id, "OFF"))));
        SmartDeviceGroup group = new SmartDeviceGroup(basegrouplist);

        boolean keepgoing = true;

        while(keepgoing) {
            System.out.println("Now you can: add a device(add),remove a device(remove),update a device(update),check the status of your devices(status),or quit(quit)");
            String choice = scan.nextLine();

            if (choice.equals("add")) {
                System.out.println("Put in an INTEGER id for your new device in the group");
                int ident = scan.nextInt();
                scan.nextLine();

                System.out.println("Put in a name for your new device in the group");
                String name = scan.nextLine();
                group.addDevice(new SmartDevice(name, ident, "OFF"));

            } else if (choice.equals("remove")) {
                System.out.println("Put in an INTEGER id for the device you want removed from the group");
                int ident = scan.nextInt();
                scan.nextLine();
                group.removeDevice(ident);

            } else if (choice.equals("update")) {
                boolean notaState = true;
                System.out.println("Put in an INTEGER id for the device you want updated in the group");
                int ident = scan.nextInt();
                scan.nextLine();

                System.out.println("Put in a NEW name for your device in the group");
                String nameNew = scan.nextLine();

                while (notaState) {
                    System.out.println("Put in a NEW state(ON or OFF) for your device in the group");
                    String stateNew = scan.nextLine();
                    if (stateNew.equals("OFF") || stateNew.equals("ON")) {
                        group.updateDevice(ident, nameNew, stateNew);
                        notaState = false;
                    } else {
                        System.out.println(" please put in a valid state(ON or OFF)");
                    }
                }
            } else if (choice.equals("quit")) {
                keepgoing = false;

            } else if (choice.equals("status")){
                group.printDevices();
            }else{
                System.out.println("Not recognized, please use: add, remove, update, ,status, quit");
            }
        }
    }
}
