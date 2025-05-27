package StrategyPattern;

import StrategyPattern.ConcreteClass.OffroadDriveVehicle;
import StrategyPattern.ConcreteClass.PassengerDriveVehicle;
import StrategyPattern.ConcreteClass.SportDriveVehicle;

public class test {
    public static void main(String[] args) {
        OffroadDriveVehicle obj1 = new OffroadDriveVehicle();
        SportDriveVehicle obj2 = new SportDriveVehicle();
        PassengerDriveVehicle obj3 = new PassengerDriveVehicle();
        obj1.drive();
        obj2.drive();
        obj3.drive();
    }
}
