package parkingLot.SpaceAvailabilityCheck.SlotInterface;

public class Slot {
    int slotNumber;
    boolean isAvailable;

    public boolean getIsAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public int getSlotNumber() {
        return slotNumber;
    }
    public Slot(int slotNumber, boolean isAvailable) {
        this.slotNumber = slotNumber;
        this.isAvailable = isAvailable;
    }
}
