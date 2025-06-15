package parkingLot.Vehicle;


import parkingLot.PriceCaluclatorModule.PriceCaluclator.CarPriceCaluclator;

public class Car extends Vehicle {

    public Car(String vehicleId) {
        super(new CarPriceCaluclator(),vehicleId);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }
}
