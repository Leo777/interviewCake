package com.interviewcake.algolearn.Model.patterns.factory.AbstractFactory;

public class TruckFactory implements AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle() {
        Truck truck = new Truck("Volvo","White");
        return truck;
    }
}
