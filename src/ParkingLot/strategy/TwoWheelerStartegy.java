package ParkingLot.strategy;

public class TwoWheelerStartegy implements VehicleStartegy {
    @Override
    public Long getBasicFee() {
        return 20L;
    }
}
