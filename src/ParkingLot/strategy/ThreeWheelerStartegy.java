package ParkingLot.strategy;

public class ThreeWheelerStartegy implements VehicleStartegy {
    @Override
    public Long getBasicFee() {
        return 30L;
    }
}
