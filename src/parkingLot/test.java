package parkingLot;


import parkingLot.SpaceAvailabilityCheck.ParkingSlot;
import parkingLot.Vehicle.Bike;
import parkingLot.Vehicle.Car;
import parkingLot.Vehicle.VehicleType;

public class test {
    public static void main(String[] args) {
        ParkingSlot parkingSlot = new ParkingSlot();
        parkingSlot.initSlots(VehicleType.BIKE,30);
        parkingSlot.initSlots(VehicleType.CAR,30);
        Bike obj1 = new Bike("BIKE 1");
        Car obj3 = new Car("CAR 1");
        parkingSlot.generateSlotNumber(obj3.getType(),obj3);
        parkingSlot.releaseSlot(obj3.getType(),obj3);
        Car obj4 = new Car("CAR 2");
        parkingSlot.generateSlotNumber(obj4.getType(),obj4);
        Car obj5 = new Car("CAR 3");
        parkingSlot.generateSlotNumber(obj5.getType(),obj5);

        System.out.println(obj1.caluclatePrice(3));
    }
}
