package StrategyPattern.ConcreteClass;

import StrategyPattern.Interface.OffRoadDrive;

public class OffroadDriveVehicle extends Vehicle {

    public OffroadDriveVehicle() {
        super(new OffRoadDrive());
    }
}
