package ParkingLot.service;

import ParkingLot.model.Ticket;
import ParkingLot.model.Vehicle;

public class ParkingService {
    private ParkingSlotManagerService parkingSlotManagerService;
    private BillService billService;

    public Ticket getParkingTicket(Vehicle vehicle) {
        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setInTime(System.currentTimeMillis());
        ticket.setParkingSlot(getParkingSlot());
        return ticket;
    }

    public String getParkingSlot(){
        return parkingSlotManagerService.getEmptySlot();
    }

    public Long getFinalBillAmount(Ticket ticket) {
        parkingSlotManagerService.emptyOccupiedSlot(ticket);
        return billService.getBillAmount(ticket);
    }
}
