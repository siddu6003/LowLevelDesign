package ParkingLot.strategy;

public class FourWheelerStartegy implements VehicleStartegy {
    @Override
    public Long getBasicFee() {
        return 40L;
    }
}
