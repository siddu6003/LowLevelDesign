package SOLID.SingleResponsibilityPrinciple;

class Invoice {
    private Marker marker;
    private long quantity;

    public long calculateInvoice() {
        return quantity * marker.getPrice();
    }
}
