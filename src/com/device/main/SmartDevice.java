package com.device.main;

import java.util.Timer;
import java.util.TimerTask;

public class SmartDevice {
    private String name;
    private int id; //we might need a different data type
    private String currentState;
    Timer timer;
    int schedule; // how long after being on should the device turn off.
    //FUNCTIONALITIES REQUIRED
    //Create a smart device instance
    //Add/remove/delete/TODO: update the smart device in a group of devices
    //Move devices between groups
    //Turn on/off a device
    //Show the state of all devices
    //Set a timer for a device with a simple trigger (on/off), i.e. turn off device 30 minutes after it was turned on.
    //TODO: Set a schedule for a device (on/off), i.e. turn on a device at 12:30.

    public SmartDevice() {

    }

    public int getSchedule() {
        return schedule;
    }

    public void setSchedule(int schedule) {
        this.schedule = schedule;
    }

    public Timer getTimer() {
        return timer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SmartDevice(String name, int id, String currentState){
        this.name = name;
        this.id = id;
        this.currentState = currentState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public String toString(){
        return this.id + " " + this.name + " " + this.currentState;
    }

    public void turnOffOn() {
        if (this.getCurrentState().equals("ON")) {
            this.setCurrentState("OFF");
        }

        if (this.getCurrentState().equals("OFF")) {
            this.setCurrentState("ON");
        }
    }

    public void delayedTurnOffOn ( int delay){
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(currentState.equals("ON")){
                    currentState = "OFF";
                }else if(currentState.equals("OFF")){
                    currentState = "ON";
                }
            }
            //the parameter is turned to minutes
        }, delay * 60 * 1000);
    }
}
