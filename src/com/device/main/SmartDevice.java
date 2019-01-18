package com.device.main;

import java.util.Timer;

public class SmartDevice {
    private String name;
    private int id; //we might need a different data type
    private String currentState;
    Timer timer;
    int schedule; // how long after being on should the device turn off.

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

}