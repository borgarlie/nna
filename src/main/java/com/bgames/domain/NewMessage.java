/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bgames.domain;

/**
 *
 * @author Borgar
 */
public class NewMessage {
    private String message;
    private String test_message = "SUP";
    private double random_nr = 2;

    public double getRandom_nr() {
        double temp = 10000;
        return random_nr * temp * Math.random();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTest_message() {
        return test_message;
    }

    @Override
    public String toString() {
        return "NewMessage{" + "message=" + message + '}';
    }
    
}
