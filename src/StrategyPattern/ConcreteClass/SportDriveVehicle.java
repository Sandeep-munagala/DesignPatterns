package StrategyPattern.ConcreteClass;


import StrategyPattern.Interface.SportDrive;

public class SportDriveVehicle extends Vehicle {

    public SportDriveVehicle() {
        super(new SportDrive());
    }

}
