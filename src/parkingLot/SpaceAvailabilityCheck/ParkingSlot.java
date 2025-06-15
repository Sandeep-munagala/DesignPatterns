package parkingLot.SpaceAvailabilityCheck;

import parkingLot.SpaceAvailabilityCheck.SlotInterface.Slot;
import parkingLot.Vehicle.Vehicle;
import parkingLot.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingSlot {

    HashMap<VehicleType, ArrayList<Slot>> slotsMap = new HashMap<>();

    public void initSlots(VehicleType vehicleType, int totalSlots) {
        ArrayList<Slot> slots = new ArrayList<>();
        for (int i = 0; i < totalSlots; ++i) {
            slots.add(new Slot(i,true));
        }
        ArrayList<Slot> availableSlots = slotsMap.getOrDefault(vehicleType, new ArrayList<>());
        availableSlots.addAll(slots);
        slotsMap.put(vehicleType, slots);
    }
    public void generateSlotNumber(VehicleType vehicleType,Vehicle vehicle) {
        ArrayList<Slot> slots = slotsMap.get(vehicleType);
        boolean found = false;
        for (Slot slot : slots) {
            if(slot.getIsAvailable() && !found){
                slot.setIsAvailable(false);
                vehicle.assignSlot(slot);
                found = true;
                System.out.println("park at slot number for " + vehicle.getVehicleId() + " : " + slot.getSlotNumber());
            }
        }
        if(!found){
            System.out.println("No slot available");
        }
    }

    public void releaseSlot(VehicleType vehicleType,Vehicle vehicle){
        int slotNumber = vehicle.getAllocatedSlot().getSlotNumber();
        vehicle.assignSlot(null);
        ArrayList<Slot> slots = slotsMap.get(vehicleType);
        for(Slot slot : slots){
            if(slot.getSlotNumber() == slotNumber){
                System.out.println("releasing slot at slot number " + slot.getSlotNumber());
                slot.setIsAvailable(true);
            }
        }
    }
}
