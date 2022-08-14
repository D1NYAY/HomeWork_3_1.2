package com.company;

public class LimitException extends Exception{
    public LimitException(String message, double remeiningAmount) {
        super(message);
        this.remeiningAmount = remeiningAmount;
    }

    public double getRemeiningAmount() {
        return remeiningAmount;
    }

    private double remeiningAmount;

}
