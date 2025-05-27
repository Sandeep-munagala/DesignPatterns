package StrategyPattern.ConcreteClass;

import StrategyPattern.Interface.DriveModeInterface;

public class Vehicle {

    DriveModeInterface drive;

    Vehicle(DriveModeInterface drive) {
        this.drive = drive;
    }

    public void drive() {
        drive.drive();
    }
}
