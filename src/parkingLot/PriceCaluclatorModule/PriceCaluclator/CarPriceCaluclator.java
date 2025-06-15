package parkingLot.PriceCaluclatorModule.PriceCaluclator;

public class CarPriceCaluclator implements PriceCaluclator{
    int pricePerHour = 50;


    @Override
    public int calculatePrice(int hours) {
        return hours * pricePerHour;
    }
}
