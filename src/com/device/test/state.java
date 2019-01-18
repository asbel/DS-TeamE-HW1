package com.device.test;

import com.device.main.SmartDevice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class state {

    SmartDevice device = new SmartDevice();
    String state = "on";
    device.setCurrentState(state);

    @Test
    public  void testState(){
        assertEquals(state,device.getCurrentState());
    }
}

