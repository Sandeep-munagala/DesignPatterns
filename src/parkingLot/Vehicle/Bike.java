package parkingLot.Vehicle;

import parkingLot.PriceCaluclatorModule.PriceCaluclator.BikePriceCaluclator;

public class Bike extends Vehicle {

    public Bike(String vehicleId) {
        super(new BikePriceCaluclator(), vehicleId);

    }

    @Override
    public VehicleType getType() {
        return VehicleType.BIKE;
    }
}
