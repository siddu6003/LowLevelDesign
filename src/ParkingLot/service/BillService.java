package ParkingLot.service;

import ParkingLot.model.Ticket;

public class BillService {
    private static Long HOUR_IN_SECONDS = 3600L;
    private static Long MILLI_TO_NORMAL_SECONDS_CONVERTER = 1000L;
    public Long getBillAmount(Ticket ticket) {
        Long parkedDuration = ticket.getInTime() - System.currentTimeMillis();
        Long hoursParked = (parkedDuration * MILLI_TO_NORMAL_SECONDS_CONVERTER)/HOUR_IN_SECONDS;
        return hoursParked * ticket.getVehicle().getBasicChargePerHour();
    }
}
