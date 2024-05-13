package ParkingLot.model;

import ParkingLot.enums.VehicleType;
import ParkingLot.strategy.VehicleStartegy;

public class Vehicle {
    private String vehicleNumber;
    private String color;
    private VehicleType vehicleType;
    private VehicleStartegy vehicleStartegy;

    public Long getBasicChargePerHour() {
        return vehicleStartegy.getBasicFee();
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleStartegy getVehicleStartegy() {
        return vehicleStartegy;
    }

    public void setVehicleStartegy(VehicleStartegy vehicleStartegy) {
        this.vehicleStartegy = vehicleStartegy;
    }
}
