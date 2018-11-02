package com.interviewcake.algolearn.Model.patterns.factory.AbstractFactory;

public class Truck implements Vehicle{
    private String model;
    private String color;

    public Truck(String model, String color) {
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
