package com.interviewcake.algolearn.Model.patterns.factory.AbstractFactory;

public class Automobile implements Vehicle {
    private String model;
    private String color;

    public Automobile(String model, String color) {
        this.model = model;
        this.color = color;
    }


    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }
}
