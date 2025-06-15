package parkingLot.PriceCaluclatorModule.PriceCaluclator;

public class BikePriceCaluclator implements PriceCaluclator{
    int pricePerHour = 25;


    @Override
    public int calculatePrice(int hours) {
        return hours * pricePerHour;
    }
}
