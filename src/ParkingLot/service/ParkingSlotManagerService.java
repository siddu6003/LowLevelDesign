package ParkingLot.service;

import ParkingLot.model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class ParkingSlotManagerService {
    private Map<String, Boolean> slotMap;
    private Integer noOfRows;
    private Integer noOfColumns;

    ParkingSlotManagerService(int rows, int columns) {
        this.noOfRows = rows;
        this.noOfColumns = columns;
        this.slotMap = new HashMap<>();
        initializeParkingLot();
    }

    public void initializeParkingLot() {
        for (int row = 1; row <= noOfRows; row++) {
            for (int column = 1; column <= noOfColumns; column++) {
                String key = row + "-" + column;
                slotMap.put(key, slotMap.getOrDefault(key, true));
            }
        }
    }
    public String getEmptySlot() {
        String slot = findEmptySlot();
        if (slot == null) return "No Slots Available";
        return slot;
    }

    public String findEmptySlot() {
        for (int row = 1; row <= noOfRows; row++) {
            for (int column = 1; column <= noOfColumns; column++) {
                if (isVacant(row, column)) {
                    String key = row + "-" + column;
                    slotMap.put(key, false);
                    return key;
                }
            }
        }
        return null;
    }

    private boolean isVacant(int row, int column) {
        return slotMap.get(row + "-" + column);
    }

    public void emptyOccupiedSlot(Ticket ticket) {
        slotMap.put(ticket.getParkingSlot(), true);
    }
}
