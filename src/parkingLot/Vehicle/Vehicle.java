package parkingLot.Vehicle;

import parkingLot.PriceCaluclatorModule.PriceCaluclator.PriceCaluclator;
import parkingLot.SpaceAvailabilityCheck.SlotInterface.Slot;

import java.util.Objects;



public abstract class Vehicle {

    protected Slot slot;
    protected String vehicleId;
    PriceCaluclator priceCaluclator;
    int hours;
    public void assignSlot(Slot slot) {
        this.slot = slot;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public Slot getAllocatedSlot() {
        return slot;
    }
    Vehicle(PriceCaluclator priceCaluclator, String vehicleId) {
        this.priceCaluclator = priceCaluclator;
        this.vehicleId = vehicleId;
    }
    public abstract VehicleType getType();

    public int caluclatePrice(int hours) {
        return priceCaluclator.calculatePrice(hours);
    }
}
