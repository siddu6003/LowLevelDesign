package ParkingLot.enums;

public enum VehicleType {
    TWO_WHEELER("TWO"),
    THREE_WHEELER("THREE"),
    FOUR_WHEELER("FOUR");

    private String vehicleType;

    VehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
