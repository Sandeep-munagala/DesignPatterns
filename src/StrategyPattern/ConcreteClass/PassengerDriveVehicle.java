package StrategyPattern.ConcreteClass;

import StrategyPattern.Interface.PassengerDrive;

public class PassengerDriveVehicle extends Vehicle {

    public PassengerDriveVehicle(){
        super(new PassengerDrive());
    }
}
