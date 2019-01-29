package main.java.DS.TeamE.HW1;

import main.java.DS.TeamE.HW1.SmartDevice;

import java.util.List;

public class SmartDeviceGroup{
    //this will likely need to hold a list of Smart device objects, that can then be iterated through to perform various functions on them all

    private List<SmartDevice> deviceGroup;

    public SmartDeviceGroup(List<SmartDevice> devices){
        deviceGroup = devices;
    }

    public void turnOffAll(){
        for(SmartDevice currDev: deviceGroup){
            currDev.setCurrentState("OFF");
        }
    }

    public void turnOnAll(){
        for(SmartDevice currDev: deviceGroup){
            currDev.setCurrentState("ON");
        }
    }

    public void addDevice(SmartDevice dev){
        deviceGroup.add(dev);
    }

    public boolean removeDevice(int id){
        boolean devRemoved = false;
        for(SmartDevice currDev: deviceGroup){
            //if the device with a matching id is found in the group, it is removed
            if(currDev.getId() == id){
                deviceGroup.remove(currDev);
                devRemoved = true;
            }
        }
        return devRemoved;
    }
    // given a tartget group and ID of the device to move to that group, it will move the ID device to target group
    public boolean moveDevice(int idDev,SmartDeviceGroup target){
        boolean devMoved = false;
        SmartDevice soontobeMoved = null;
        for(SmartDevice currDev: deviceGroup){
            //if the device with a matching id is found in the group, it is temporarily stored and removed
            if(currDev.getId() == idDev){
                soontobeMoved = currDev;
                deviceGroup.remove(currDev);
                devMoved = true;
            }
        }
        if(devMoved == true) {
            target.addDevice(soontobeMoved);
        }
        return devMoved;
    }

    public boolean updateDevice(int id,String name,String state){
        boolean devUpdated = false;
        for(SmartDevice currDev: deviceGroup){
            //if the device with a matching id is found in the group, it is removed
            if(currDev.getId() == id){
                currDev.setName(name);
                currDev.setCurrentState(state);
                devUpdated = true;
            }
        }
        return devUpdated;
    }

    public void printDevices(){
        for(SmartDevice currDev: deviceGroup){
            System.out.println(currDev.getName() + ": State: "+ currDev.getCurrentState() + " ID: " + currDev.getId());
        }
    }

}
