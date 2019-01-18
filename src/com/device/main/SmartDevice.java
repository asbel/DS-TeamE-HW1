package com.device.main;

public class SmartDevice {
    private String name;
    private int id; //we might need a different data type
    private String currentState;

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